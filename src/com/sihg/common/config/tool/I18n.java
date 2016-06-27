package com.sihg.common.config.tool;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * 国际化工具
 * @author Administrator
 *
 */
public class I18n {
  private static Map<String, ResourceBundle> rbMap = new HashMap<String, ResourceBundle>();

  public static String text(String key) {
    return text(key, Locale.getDefault());
  }

  public static String text(String key, Locale l) {
    String result = key;
    ResourceBundle rb = rbMap.get(l.toString());
    if (rb == null) {
      rb = ResourceBundle.getBundle("text", l); // TODO 这里暂时这么写
      rbMap.put(l.toString(), rb);
    }
    if (rb.containsKey(key)) {
      result = rb.getString(key).trim();
    }
    return result;
  }
}
