package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by 我们结婚吧 on 2020/7/26.
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize=3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id :%s%n",Thread.currentThread().getId());
    }
}
