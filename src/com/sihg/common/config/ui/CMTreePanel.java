package com.sihg.common.config.ui;

import java.util.Enumeration;

import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

public class CMTreePanel extends JScrollPane {

	/**  */
	private static final long serialVersionUID = 1L;
	private JTree tree = new JTree();
	private DefaultMutableTreeNode root = new DefaultMutableTreeNode();
	private TreeModel treeModel = new DefaultTreeModel(root);

	public CMTreePanel() {
		super();
		// 隐藏树根节点。因为没什么用
		tree.setRootVisible(false);
		tree.setModel(treeModel);
		setViewportView(tree);
		// TODO 可能需要自己封装一个树节点类。
		root.add(new MutableTreeNode() {

			@Override
			public boolean isLeaf() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public TreeNode getParent() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getIndex(TreeNode node) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getChildCount() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public TreeNode getChildAt(int childIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean getAllowsChildren() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Enumeration children() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setUserObject(Object object) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setParent(MutableTreeNode newParent) {
				// TODO Auto-generated method stub

			}

			@Override
			public void removeFromParent() {
				// TODO Auto-generated method stub

			}

			@Override
			public void remove(MutableTreeNode node) {
				// TODO Auto-generated method stub

			}

			@Override
			public void remove(int index) {
				// TODO Auto-generated method stub

			}

			@Override
			public void insert(MutableTreeNode child, int index) {
				// TODO Auto-generated method stub

			}
		});
	}
}
