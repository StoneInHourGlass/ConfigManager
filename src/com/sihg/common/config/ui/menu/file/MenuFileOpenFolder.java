package com.sihg.common.config.ui.menu.file;

import java.awt.event.ActionEvent;

import com.sihg.common.config.tool.I18n;
import com.sihg.common.config.ui.menu.CMMenuItem;

public class MenuFileOpenFolder extends CMMenuItem {

  /**  */
  private static final long serialVersionUID = 1L;

  public MenuFileOpenFolder() {
    super(I18n.text("openFolder"), I18n.text("new"), null);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO
  }
}
