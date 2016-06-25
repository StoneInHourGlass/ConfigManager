package com.sihg.common.config.test.properties;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class TestProperties {
  public static void main(String[] args) {
    System.out.println("Locale.getDefault():[" + Locale.getDefault() + "]");
    System.out.println("冲突测试");
    System.out.println("Locale.JAPANESE:[" + Locale.JAPANESE + "] Locale.JAPAN:[" + Locale.JAPAN + "]");
    System.out.println("冲突测试");
    Locale.setDefault(Locale.JAPAN);
    System.out.println("冲突测试");
    ResourceBundle rb = ResourceBundle.getBundle("text");
    System.out.println("冲突测试");
    System.out.println("edit:[" + rb.getString("edit") + "]");
    System.out.println("冲突测试");
    InputStream in;
    System.out.println("冲突测试");
    try {
      in = new BufferedInputStream(new FileInputStream("E:/GitHub/ConfigManager/test.properties"));
      Properties p = new Properties();
      p.load(in);
      System.out.println();
      System.out.println();
      System.out.println("a1:[" + p.getProperty("a1") + "] a2:[" + p.getProperty("a2") + "] a3.b1:[" + p.getProperty("a3.b1") + "]");
      System.out.println("分支测试");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
