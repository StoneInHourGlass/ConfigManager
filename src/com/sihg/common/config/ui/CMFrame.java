package com.sihg.common.config.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.sihg.common.config.tool.I18n;
import com.sihg.common.config.ui.menu.CMMenuBar;

/**
 * 配置文件管理器主窗口
 */
public class CMFrame extends JFrame {

	/**  */
	private static final long serialVersionUID = 1L;
	private CMSplitPanel cmsp = new CMSplitPanel();

	/**
	 * 主窗口实例化方法
	 */
	public CMFrame() {
		try {
			// 设置界面样式 TODO 这里可以使用配置
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(800, 600);
		setMinimumSize(new Dimension(640, 480));
		setTitle(I18n.text("title"));
		setJMenuBar(new CMMenuBar(this));
		setLayout(new BorderLayout());
		add(cmsp, BorderLayout.CENTER);
	}

	@Override
	public void setVisible(boolean aFlag) {
		super.setVisible(aFlag);
		cmsp.setDividerLocation(0.3);
	}
}
