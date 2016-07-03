package com.sihg.common.config.ui.menu;

import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JMenuItem;

/**
 * 可能暂时用不到 之后菜单多了 提取出比较通用的设置再用这个
 */
public abstract class CMMenuItem extends JMenuItem implements ActionListener {
  /**  */
  private static final long serialVersionUID = 1L;

  public CMMenuItem(String title, String toolTip, Icon icon) {
    super();
    setText(title);
    setIcon(icon);
    setToolTipText(toolTip);
    addActionListener(this);
  }
}
