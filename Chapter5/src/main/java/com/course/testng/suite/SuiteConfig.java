package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by 我们结婚吧 on 2020/7/15.
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦 ");
    }
    @AfterSuite
public void aftersuite(){
    System.out.println("after suite 运行啦 ");
}
}
