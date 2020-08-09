package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by 我们结婚吧 on 2020/7/19.
 */
public class GroupsOnClass2 {
    @Test(groups = "stu")
    public void stus1(){
        System.out.println("GroupsOnClass1111中的stu2运行");
    }
    @Test(groups = "stu")
    public void stus2(){
        System.out.println("GroupsOnClass222中的stu2运行");
    }
}
