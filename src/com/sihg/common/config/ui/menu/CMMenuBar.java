package com.sihg.common.config.ui.menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import com.sihg.common.config.tool.I18n;

public class CMMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame owner;

	public CMMenuBar(JFrame owner) {
		this.owner = owner;
		JMenu jmFile = new JMenu(I18n.text("file"));
		jmFile.add(new MenuFileNew());
		jmFile.addSeparator();// 添加分割线
		jmFile.add(new MenuFileOpen(this.owner));
		add(jmFile);
	}
}
