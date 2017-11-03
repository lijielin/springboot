package com.incar.ljl.pagehelper.utils;

/**
 * Created by lijielin on 2017/11/3.
 */
public class StirngUtil {
    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
