package com.nongkeezhan.nkez.utils;

import java.util.Random;

/**
 * Created by hugay on 2019/2/27
 */
public class KeyUtils {
    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
