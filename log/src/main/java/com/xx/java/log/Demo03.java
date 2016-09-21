package com.xx.java.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/21.
 * slf4j
 */

public class Demo03 {

    private final static Logger logger = LoggerFactory.getLogger(Demo03.class);

    public static void main(String[] args) {

        logger.debug("debug:{}", "aa");

        logger.info("info:{}", 123);

        List<String> list = new ArrayList<String>();
        list.add("haha");
        list.add("hehe");

        logger.warn("warn:{}", list);

        logger.error("error:{}", list);


    }

}
