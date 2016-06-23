package com.sihg.common.config.ui;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;

public abstract class CMMenuItem extends JMenuItem implements ActionListener {
  /**  */
  private static final long serialVersionUID = 1L;

  public CMMenuItem(String title) {
    super(title);
    addActionListener(this);
  }
}
