package com.course.testng;

import org.omg.CORBA.portable.IndirectionException;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

/**
 * Created by admin on 2020/7/27.
 * 超时测试
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess()throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFail() throws InterruptedException{
        Thread.sleep(3000);
    }
}
