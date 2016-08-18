package com.sihg.common.config.ui.menu.file;

import java.awt.event.ActionEvent;

import com.sihg.common.config.tool.I18n;
import com.sihg.common.config.ui.menu.CMMenuItem;

public class MenuFileNew extends CMMenuItem {

	/**  */
	private static final long serialVersionUID = 1L;

	public MenuFileNew() {
		super(I18n.text("new"), I18n.text("new"), null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO
	}
}
