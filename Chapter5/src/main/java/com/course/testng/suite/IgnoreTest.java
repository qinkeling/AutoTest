package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * Created by 我们结婚吧 on 2020/7/19.
 * 忽略测试方法，不执行
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.print("ignore 3执行");
    }
}
