package com.sihg.common.config;

import javax.swing.JFrame;

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

  public Entrance() {
    super();
    // 关闭的时候 同时结束进程
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(640, 480);
    //test继续吧
    // TODO 宝宝:应该再做些初始化什么的
    //test学习Github测试的
  }

  public static void main(String[] args) {
    new Entrance().setVisible(true);
  }
}
