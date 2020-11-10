package com.lijiaying.keshe.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public static String getFormatDate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return formatter.format(date);
    }
}
