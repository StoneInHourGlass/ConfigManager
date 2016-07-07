package com.sihg.common.config.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class CMFilePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public CMFilePanel() {
		super();
		setLayout(new BorderLayout());
		add(new CMTreePanel(), BorderLayout.CENTER);
	}
}
