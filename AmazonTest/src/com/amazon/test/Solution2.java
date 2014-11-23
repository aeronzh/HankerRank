package com.amazon.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node _root;
		int root_i = 0, root_cnt = 0, root_num = 0;
		_root = null;
		int isBst = in.nextInt();
		root_cnt = in.nextInt();
		for (root_i = 0; root_i < root_cnt; root_i++) {
			root_num = in.nextInt();
			if (isBst == 0) {
				_root = addRandomElement(_root, root_num, root_i);
			} else {
				_root = insert(_root, root_num);
			}
		}
		System.out.println(diameterOfTree(_root.left));

		return;
	}

	public static class Node {
		Node left, right;
		int data;

		public Node(int newData) {
			left = right = null;
			data = newData;
		}
	}

	public static int getLongestPath(Node root) {
		int path = 0;
		int leftPath = 0;
		int rightPath = 0;
		if (null == root)
			return path;
		if (null != root.left) {
			leftPath = getLongestPath(root.left);
		}
		if (null != root.right) {
			rightPath = getLongestPath(root.right);
		}

		path = leftPath >= rightPath ? leftPath : rightPath;

		return path + 1;
	}

	/* Write your custom functions here */
	public static int diameterOfTree(Node root) {
		if (root == null)
			return 0;
		int leftPath = getLongestPath(root.left);
		int rightPath = getLongestPath(root.right);

		return leftPath + rightPath + 1;

	}

	public static Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (data < node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return (node);
	}

	public static Node addRandomElement(Node node, int data, int index) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (index <= 2) {
				node.left = addRandomElement(node.left, data, index);
			} else {
				node.right = addRandomElement(node.right, data, index);
			}

		}
		return (node);
	}
}
