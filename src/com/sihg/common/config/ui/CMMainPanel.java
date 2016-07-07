package com.sihg.common.config.ui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class CMMainPanel extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CMMainPanel() {
		super();
		setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}

	public boolean addTab(JPanel panel) {
		add(panel);
		return false;
	}
}
