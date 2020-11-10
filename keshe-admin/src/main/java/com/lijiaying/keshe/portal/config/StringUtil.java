package com.lijiaying.keshe.portal.config;
//微信返回的结果为Xml格式的字符串，XmlUtil主要用于解析结果

import java.util.Map;

/**
 * @Description: String工具类
 * @author: Administrator
 * @date: 2019/6/19 11:31
 */
public class StringUtil {

    /**
     * @Function: 将map转换为xml
     * @author:   YangXueFeng
     * @Date:     2019/6/19 11:32
     */
    public static String GetMapToXML(Map<String,String> param){
        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");
        for (Map.Entry<String,String> entry : param.entrySet()) {
            sb.append("<"+ entry.getKey() +">");
            sb.append(entry.getValue());
            sb.append("</"+ entry.getKey() +">");
        }
        sb.append("</xml>");
        return sb.toString();
    }
}