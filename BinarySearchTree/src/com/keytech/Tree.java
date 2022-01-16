package com.keytech;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	
	public int get(int value) {
		if (root != null) {
			return root.get(value);
		}
		
		return 0;
	}
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
}
