package com.xx.java.log;

import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2016/9/21.
 *
 * log4j日志系统
 *
 */

public class Demo02 {

    private final static Logger logger = Logger.getLogger(Demo02.class);

    public static void main(String[] args) {
        // System.out
        System.out.println("System out println");
        // 记录debug级别的信息
        logger.debug("log4j debug");
        // 记录info级别的信息
        logger.info("log4j info");
        // 记录error级别的信息
        logger.error("log4j error");

    }

}
