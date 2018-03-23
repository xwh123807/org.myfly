package org.org.myfly.apps.skymonitor.internal;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

/**
 * Created by xiangwanhong on 15/7/19.
 */
public class Utils {
    /**
     * -c conf -n a1 -f flume.conf --spring.config.name=myproject.properties
     * @param args
     * @return
     */
    public static Map<String, String> extractArgs(String[] args){
        Map<String, String> items = new HashMap<String, String>();
        for (int i = 0; i < args.length; ){
            if (args[i].startsWith("--") || args[i].startsWith("-D")){
                String[] ps = args[i].split("=");
                items.put(ps[0].substring(2), ps[1]);
                i ++;
            }else if (args[i].startsWith("-")){
                items.put(args[i].substring(1), args[i+1]);
                i = i+2;
            }else{
                throw new RuntimeException("参数错误.");
            }
        }
        return items;
    }

    /**
     * 系统时间
     * @return
     */
    public static Calendar now(){
        return Calendar.getInstance();
    }
    /**
     *
     * @param date
     * @return
     */
    public static String datetimeToStr(Calendar date){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        return sdf.format(date.getTime());
    }

    /**
     *
     * @return
     */
    public static String nowStr(){
        return datetimeToStr(now());
    }

    /**
     *
     * @return
     */
    public static String getWorkDir(){
        return System.getProperty("user.dir");
    }

    /**
     *
     * @param fileName
     * @return
     */
    public static Properties getProperties(String fileName){
        try{
            FileInputStream file = new FileInputStream(fileName);
            Properties p = new Properties();
            p.load(file);
            return p;
        }catch(Exception e){
            return new Properties();
        }
    }

    /**
     *
     * @param fileName
     * @param property
     * @param defaultValue
     * @return
     */
    public static String getProperty(String fileName, String property, String defaultValue){
        try{
            Properties p = Utils.getProperties(fileName);
            return p.getProperty(property, defaultValue);
        }catch(Exception e){
            return defaultValue;
        }
    }

    /**
     *
     * @param fileName
     * @param property
     * @param value
     * @return
     */
    public static void setProperty(String fileName, String property, String value){
        try{
            Properties p = Utils.getProperties(fileName);
            p.setProperty(property, value);
            FileOutputStream out = new FileOutputStream(fileName);
            p.store(out, null);
        }catch(Exception e){
            throw new RuntimeException("文件更新失败，文件" + fileName + "，错误原因：" + e.getMessage());
        }
    }

    /**
     *
     * @param fileName
     */
    public static void deleteFile(String fileName){
        File file = new File(fileName);
        file.deleteOnExit();
    }

    /**
     *
     */
    public static String getDateHourStr(Calendar date){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:00:00");
        return sdf.format(date.getTime());
    }

    /**
     * 执行操作系统命令，返回响应信息
     * @param cmd
     * @return
     */
    public static String runCommand(String cmd){
        System.out.println("运行命令：" + cmd);
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获取随机字符串
     * @return
     */
    public static String getUUID(){
        String str = UUID.randomUUID().toString();
        return str.replaceAll("-", "");
    }

    /**
     * 将文件移动到指定目录下，返回新文件名
     * @param file
     * @param destDir
     * @param isRename
     * @return
     */
    public static String moveFile(File file, String destDir, boolean isRename) throws Exception{
        String destFile = destDir + (destDir.endsWith("/")?"":"/") + file.getName();
        if (isRename){
            destFile += "." + Utils.getUUID();
        }
        FileUtils.moveFile(file, new File(destFile));
        System.out.println("复制文件" + file.getPath() + "到目录" + destFile);
        return destFile;
    }

    /**
     * 将srcDir目录下的文件移动到destDir目录下，为避免和目标目录下文件重复，在文件后增加随机uuid
     * @param srcDir
     * @param destDir
     * @param isRename      是否需要重命名
     */
    public static  void moveDirectoryFilesToDirectory(String srcDir, String destDir, boolean isRename){
        Collection<File> files = FileUtils.listFiles(new File(srcDir), null, false);
        for (File file : files){
            try {
                moveFile(file, destDir, isRename);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取fieldNames在stdFieldNames中对应的顺序
     * @param stdFieldNames
     * @param fieldNames
     * @return
     */
    public static int[] getFieldIndexes(String[] stdFieldNames, String[] fieldNames){
        int[] result = new int[stdFieldNames.length];
        for (int i = 0; i < stdFieldNames.length; i ++){
            String name = stdFieldNames[i];
            for (int j = 0; j < fieldNames.length; j ++){
                if (name.equals(fieldNames[j])){
                    result[i] = j + 1;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 判断字符串是否为空
     * @param value
     * @return
     */
    public static boolean isEmpty(String value){
        return value == null || value.trim().length()==0;
    }

    /**
     * 字符串转换为整数，非法格式返回0
     * @param value
     * @return
     */
    public static int toInt(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
        }catch (Exception e){
        }
        return result;
    }


    /**
     *
     * @param delimiter
     * @param items
     * @return
     */
    public static String stringJoin(String delimiter, String[] items){
        String result = "";
        if (items == null || items.length == 0){
            return "";
        }else if (items.length == 1) {
            return items[0];
        }else {
            for (String item : items) {
                result += delimiter + item;
            }
            return result.substring(delimiter.length());
        }
    }

    /**
     * 去除重复项目
     * @param items
     * @return
     */
    public static List<String> removeDuplicate(List<String> items, boolean sort){
        Map<String, String> map = new HashMap<String, String>();
        for (String item : items){
            if (!map.containsKey(item)) {
                map.put(item, null);
            }
        }
        List<String> result = new ArrayList<String>();
        for (String key : map.keySet()){
            result.add(key);
        }
        if (sort)
            result = sortList(result);
        return result;
    }

    /**
     * List排序
     * @param items
     * @return
     */
    public static List<String> sortList(List<String> items){
        String[] arrays = items.toArray(new String[]{});
        Arrays.sort(arrays);
        List<String> result = new ArrayList<String>();
        for (String item : arrays){
            result.add(item);
        }
        return result;
    }

    /**
     * 运行命令行，返回结果
     * @param cmds
     * @return
     */
    public static String runCommand(String[] cmds, String[] envp, File dir){
        StringBuffer buffer = new StringBuffer();
        Runtime runtime = Runtime.getRuntime();
        try {
            Process p = runtime.exec(cmds, envp, dir);// 启动另一个进程来执行命令
            BufferedInputStream in = new BufferedInputStream(p.getInputStream());
            BufferedReader inBr = new BufferedReader(new InputStreamReader(in));
            String lineStr;
            while ((lineStr = inBr.readLine()) != null) {
                //获得命令执行后在控制台的输出信息
                buffer.append("\n").append(lineStr);
            }
            //检查命令是否执行失败。
            if (p.waitFor() != 0) {
                if (p.exitValue() == 1){
                    //p.exitValue()==0表示正常结束，1：非正常结束
                    buffer.append("\n").append("命令执行失败");
                }
            }
            inBr.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    /**
     * 排除s1中包含s2
     * @param s1
     * @param s2
     * @return
     */
    public static List<String> excludeList(List<String> s1, List<String> s2){
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String item : s2){
            map.put(item, null);
        }
        List<String> result = new ArrayList<String>();
        for (String item : s1){
            if (!map.containsKey(item)){
                result.add(item);
            }
        }
        return result;
    }

    /**
     *
     * @param list
     * @return
     */
    public static Map<String, Object> listToMap(List<String> list){
        Map<String, Object> result = new HashMap<String, Object>();
        for (String item : list){
            result.put(item, null);
        }
        return result;
    }

    /**
     * 
     * @param items
     * @return
     */
    public static List<String> stringArrayToList(String[] items){
        List<String> result = new ArrayList<String>();
        for (String item : items){
            result.add(item);
        }
        return result;
    }

    /**
     * Map排序
     * @param map
     * @return
     */
    public static Map<String, Object> sortMap(Map<String, Object> map){
        String[] keys = map.keySet().toArray(new String[]{});
        Arrays.sort(keys);
        Map<String, Object> result = new HashMap<String, Object>();
        for (String key : keys){
            result.put(key, map.get(key));
        }
        return result;
    }
    
    /**
     * 05/Jun/2016:10:14:54 +0800
     * @param str
     * @return
     */
    public static Date strToDate(String str){
    	try {
			Date date = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.ENGLISH).parse(str);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
    }
}

