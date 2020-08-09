package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by 我们结婚吧 on 2020/7/19.
 * 依赖测试，test2要依赖于test1 ，如支付操作，需要先登录
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
