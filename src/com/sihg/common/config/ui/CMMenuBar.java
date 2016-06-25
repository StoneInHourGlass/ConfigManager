package com.sihg.common.config.ui;

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
    jmFile.add(new JMenuItem("新建"));
    jmFile.add(new JMenuItem("打开"));
    jmFile.addSeparator();
    jmFile.add(new JMenuItem("退出"));
    add(jmFile);
  }
}
