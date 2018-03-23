package org.org.myfly.apps.skymonitor.internal;

public class ApacheLogConst {
	   /**
     * 转换三种模式，none表示不转换；regex表示使用正则表达式，在regex中配置；split表示以
     */
    public static final String CONVERTTYPE_NONE = "none";

    public static final String CONVERTTYPE_REGEX = "regex";

    public static final String CONVERTTYPE_SPLIT = "split";

    /**
     * 转换格式，缺省为text
     */
    public static final String FORMAT_TEXT = "text";

    public static final String FORMAT_JSON = "json";

    public static final String FORMAT_XML = "xml";


    /**
     * 日志解析默认正则表达式
     */
    public static final String REGEX_DFLT = "^([\\d.]+) (\\S+) (\\S+) \\[([\\w\\d:/]+\\s[+\\-]\\d{4})\\] \"(.+?) (.+?) (.+?)\" (\\d{3}) (\\S+) ([\\d\\-]+) \"([^\"]+)\" \"([^\"]+)\".* ([\\d\\-]+) ([\\d\\-]+)";

    /**
     * 日志标准字段顺序
     */
    public static final String FIELDS_DFLT = "remoteip|serverip|appname|accesstime|method|url|protocal|status|bytes|haustedtime|referer|agent|input|output";

    /**
     * 字段为数值类型的，对应FIELDS_DFLT
     */
    public static final int[] CHECK_FIELDS_INT = new int[]{8, 9, 12,13};
}
