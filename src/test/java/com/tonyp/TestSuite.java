package com.tonyp;

import org.junit.platform.suite.api.AfterSuite;
import org.junit.platform.suite.api.BeforeSuite;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestClass1.class, TestClass2.class})
public class TestSuite {

  @BeforeSuite
  static void beforeSuite() {
    System.out.println("before suite");
  }

  @AfterSuite
  static void afterSuite() {
    System.out.println("after suite");
  }
}
