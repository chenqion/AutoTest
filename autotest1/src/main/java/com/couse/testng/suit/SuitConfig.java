package com.couse.testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit运行了");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite运行了");
    }
    @BeforeMethod
    public void befoerMethod() {
        System.out.println("befoerMethod运行了");
    }
    @Test
    public void test() {
        System.out.println("test方法运行");
    }

}
