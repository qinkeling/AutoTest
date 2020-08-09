package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by 我们结婚吧 on 2020/7/19.
 */
public class GroupsOnClass3 {
    @Test(groups = "teacher")
    public void stus1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }
    @Test(groups = "teacher")
    public void stus2(){
        System.out.println("GroupsOnClass333中的teacher2运行");
    }
}
