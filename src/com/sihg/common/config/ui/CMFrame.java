package com.sihg.common.config.ui;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.sihg.common.config.tool.I18n;

/**
 * 配置文件管理器主窗口
 */
public class CMFrame extends JFrame {

  /**  */
  private static final long serialVersionUID = 1L;

  /**
   * 主窗口实例化方法
   */
  public CMFrame() {
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(800, 600);
    setMinimumSize(new Dimension(640, 480));
    setTitle(I18n.text("title"));
  }
}
