package com.sihg.common.config.ui.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.sihg.common.config.tool.I18n;

public class CMMenuBar extends JMenuBar {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public CMMenuBar() {
    JMenu jmFile = new JMenu(I18n.text("file"));
    jmFile.addSeparator();// 添加分割线
    add(jmFile);
  }
}
