package com.lijiaying.keshe.portal.util;

import java.util.Random;

/**
 * 获取四位随机验证码
 */
public class Code {
    public static String getCode(){
        //基础字符串序列
        String base = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int size = base.length();
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        int index;
        char c;
        for (int i = 0; i < 4; i++){
            //产生0到size-1随机数
            index = random.nextInt(size);
            //获取下标为index的字符
            c = base.charAt(index);
            //将字符c添加到stringBuffer中
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }
}
