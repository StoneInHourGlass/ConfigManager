package com.sihg.common.config.ui;

import javax.swing.JSplitPane;

public final class CMSplitPanel extends JSplitPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CMSplitPanel() {
		super();
		setOneTouchExpandable(true);
		setLeftComponent(new CMFilePanel());
		setRightComponent(new CMMainPanel());
	}
}
