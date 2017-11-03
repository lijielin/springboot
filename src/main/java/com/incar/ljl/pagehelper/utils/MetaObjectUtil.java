package com.incar.ljl.pagehelper.utils;

import com.github.pagehelper.PageException;
import org.apache.ibatis.reflection.MetaObject;

import java.lang.reflect.Method;

/**
 * Created by lijielin on 2017/11/3.
 */
public class MetaObjectUtil {
    public static Method method;

    static {
        try {
            Class<?> metaClass = Class.forName("org.apache.ibatis.reflection.SystemMetaObject");
            method = metaClass.getDeclaredMethod("forObject", Object.class);
        } catch (Exception e1) {
            try {
                Class<?> metaClass = Class.forName("org.apache.ibatis.reflection.MetaObject");
                method = metaClass.getDeclaredMethod("forObject", Object.class);
            } catch (Exception e2) {
                throw new PageException(e2);
            }
        }

    }

    public static MetaObject forObject(Object object) {
        try {
            return (MetaObject) method.invoke(null, object);
        } catch (Exception e) {
            throw new PageException(e);
        }
    }
}
