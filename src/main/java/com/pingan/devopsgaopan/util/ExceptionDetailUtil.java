package com.pingan.devopsgaopan.util;



public class ExceptionDetailUtil {

    public static String getExcetionDetail(Exception e) {
        StringBuffer stringBuffer = new StringBuffer(e.toString() + "\n");
        StackTraceElement[] messages = e.getStackTrace();
        int length = messages.length;
        for (int i = 0; i < messages.length; i++) {
           stringBuffer.append("\t" + messages[i].toString() + "\n");

        }
        return stringBuffer.toString();
    }
}
