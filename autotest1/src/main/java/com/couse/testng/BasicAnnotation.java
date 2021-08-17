package com.couse.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void  testCase1() {
        System.out.println("这是测试方法1");
    }
    @BeforeMethod
    public void  method1() {
        System.out.println("这是测试方法2");
    }
    @AfterMethod
    public void  method2() {
        System.out.println("这是测试方法3");
    }
    @BeforeClass
    public void  method3() {
        System.out.println("这是测试方法4");
    }
    @AfterClass
    public void  method4() {
        System.out.println("这是测试方法5");
    }

    @BeforeSuite
    public void method5() {
        System.out.println("beforeSuit方法");
    }

    @AfterSuite
    public void method6() {
        System.out.println("AfterSuit方法");
    }

}
