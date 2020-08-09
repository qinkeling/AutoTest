package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by admin on 2020/7/26.
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name =" + name + "; age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] ob = new Object[][]{
                {"Zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}
        };
        return ob;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test111方法 name =" + name + ";age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test222方法 name =" + name + ";age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals(("test1"))) {
            result = new Object[][]{
                    {"Zhangsan", 22},
                    {"Lisi", 25}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"WANGWU", 40},
                    {"Zhangliu", 55}
            };
        }
        return result;
    }
}