package pucrs.alpro3.arvores;

public class BinarySearchTree {

	class Node {
		int value;
		Node left, right;
	}

	private Node root;
	private int count;

	public BinarySearchTree() {
		root = null;
		count = 0;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int size() {
		return count;
	}

	public void add(int value) {
		root = add(root, value);
		count++;
	}

	private Node add(Node node, int value) {
		if (node == null) {
			Node newNode = new Node();
			newNode.value = value;
			newNode.left = null;
			newNode.right = null;
			return newNode;
		} else {
			if (value < node.value) {
				node.left = add(node.left, value);
			} else if (value > node.value) {
				node.right = add(node.right, value);
			}
		}
		return node;
	}

	public boolean contains(int value) {
		// TODO
		return false;
	}

	public String toString() {
		return toString(root);
	}

	private String toString(Node node) {
		if (node == null)
			return "*";
		return node.value + " " + toString(node.left) + " "
				+ toString(node.right);
	}

}
