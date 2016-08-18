package com.sihg.common.config.ui.menu.file;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

import com.sihg.common.config.tool.I18n;
import com.sihg.common.config.ui.menu.CMMenuItem;

public class MenuFileOpen extends CMMenuItem {
	private static final long serialVersionUID = 1L;
	private JFrame owner;

	public MenuFileOpen(JFrame owner) {
		super(I18n.text("open"), I18n.text("new"), null);
		this.owner = owner;
	}

	public void actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setMultiSelectionEnabled(true);
		fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
		fileChooser.setDialogTitle(I18n.text("openFile"));
		// TODO 需要设置文件可选类型为properties、json和XML
		fileChooser.removeChoosableFileFilter(fileChooser.getFileFilter());
		fileChooser.setFileFilter(new FileFilter() {
			@Override
			public String getDescription() {
				return "打开jsonConfig/properties/xml文件";
			}

			@Override
			public boolean accept(File f) {
				String fileName = f.getName().toLowerCase();
				if (f.isDirectory() || fileName.endsWith(".json") || fileName.endsWith(".properties") || fileName.endsWith(".xml")) {
					return true;
				}
				return false;
			}
		});
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fileChooser.showOpenDialog(owner);
		// TODO 获取到选择的文件或者文件夹。构建数据结构，绘制树。
		for (File f : fileChooser.getSelectedFiles()) {
			System.out.println(f.getName());
		}
	}
}
