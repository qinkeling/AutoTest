package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by Qin on 2020/7/13.
 */
public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod(description="在每一个测试用例之前运行")
    public void beforeMethod(){
        System.out.println("这是在测试方法之前运行");
    }
    @AfterMethod(description="在每一个测试用例之后运行")
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行之后运行的方法");
    }
}
