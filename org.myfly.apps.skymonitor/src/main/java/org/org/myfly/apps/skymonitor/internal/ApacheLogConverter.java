package org.org.myfly.apps.skymonitor.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApacheLogConverter {
    /**
     * 日志格式解析正则表达式
     */
    private Pattern apacheLogRegex;

    /**
     * 转换类型，默认为none
     */
    private String converterType;

    /**
     * 当前日志字段对应标准字段的序号
     */
    private int fieldIndexes[];

    /**
     * 输出格式，默认为text
     */
    private String format;

    /**
     * 构造函数
     * @param converterType     转换类型，默认为none
     * @param regex             当converterType=regex时，指定格式解析正则表达式
     * @param fieldNames        日志字段顺序
     */
    public ApacheLogConverter(String converterType, String regex, String fieldNames){
        setConverterType(Utils.isEmpty(converterType) ? ApacheLogConst.CONVERTTYPE_NONE : converterType);
        apacheLogRegex = (Utils.isEmpty(regex)) ? Pattern.compile(ApacheLogConst.REGEX_DFLT) : Pattern.compile(regex);
        this.fieldIndexes = (Utils.isEmpty(fieldNames)) ? null : Utils.getFieldIndexes(ApacheLogConst.FIELDS_DFLT.split("\\|"), fieldNames.split("\\|"));
        this.format = ApacheLogConst.FORMAT_TEXT;
    }

    /**
     * Apache Log转换，并用fieldIndexes重新排序，各字段间用|符号分割
     *
     * @param line
     * @return
     */
    public String convert(String line){
        String result = null;
        try {
            Matcher m = apacheLogRegex.matcher(line);
            if (m.find()) {
                String[] items;
                if (fieldIndexes == null) {
                    items = new String[m.groupCount()];
                    for (int i = 1; i <= m.groupCount(); i++) {
                        items[i - 1] = m.group(i);
                    }
                } else {
                    items = new String[fieldIndexes.length];
                    int order = 0;
                    for (int index : fieldIndexes) {
                        items[order] = (index > 0) ? m.group(index) : "";
                        order ++;
                    }
                    //数值类型转换
                    for (int i : ApacheLogConst.CHECK_FIELDS_INT){
                        items[i] = String.valueOf(Utils.toInt(items[i]));
                    }
                }
                if (getFormat().equals(ApacheLogConst.FORMAT_TEXT)) {
                    result = Utils.stringJoin("|", items);
                }
            }
        }catch(Exception e){
            System.out.println("格式错误: " + e.getMessage() +"，" + line);
        }
        return result;
    }

    public Pattern getApacheLogRegex() {
        return apacheLogRegex;
    }

    public void setApacheLogRegex(Pattern apacheLogRegex) {
        this.apacheLogRegex = apacheLogRegex;
    }

    public String getConverterType() {
        return converterType;
    }

    public void setConverterType(String converterType) {
        this.converterType = converterType;
    }

    public int[] getFieldIndexes() {
        return fieldIndexes;
    }

    public void setFieldIndexes(int[] fieldIndexes) {
        this.fieldIndexes = fieldIndexes;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
