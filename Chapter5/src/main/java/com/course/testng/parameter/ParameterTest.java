package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by 我们结婚吧 on 2020/7/19.
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void paramtest1(String name,int age){
         System.out.println("name =" +name +"; age =" +age);
    }
}
