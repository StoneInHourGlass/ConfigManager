package com.sihg.common.config;

import javax.swing.JFrame;

import com.sihg.common.config.ui.CMFrame;

/**
 * 配置文件管理器的图形界面入口。
 * 
 * @author Ray
 */
public class Entrance extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public static void main(String[] args) {
    // Locale.setDefault(Locale.ENGLISH);
    new CMFrame().setVisible(true);
  }
}
