package com.lijiaying.keshe.portal.util;

import java.util.UUID;

public class Uuid {
    private Uuid(){}
    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
