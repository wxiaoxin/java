package com.xx.java.log;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2016/9/21.
 *
 * jdk自带的日志系统
 *
 */

public class Demo01 {

    private static final Logger logger = Logger.getLogger(Demo01.class.getName());

    public static void main(String[] args) {

        logger.info("aaa");
        logger.warning("warning");

    }
}
