import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalTree {

	static class Node {
		int data;
		Node right;
		Node left;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
		/*
		 * public Node newNode(int data) { Node n = new Node(); n.data = data;
		 * n.right = n.left = null; return n; }
		 */
	}

	public static void main(String[] args) {
		// LevelOrderTraversalTree tree=new LevelOrderTraversalTree();
		Node n = new Node(2);
		n.left=new Node(3);
		n.right=new Node(4);
		n.left.left=new Node(5);
		levelOrderTraversal(n);
		
	}

	public static void levelOrderTraversal(Node root) {

		// print given level for every entry
		int h = height(root);
		for (int i = 1; i <= h; i++) {
			printGivenLevel(root, i);
		}

	}

	public static void printGivenLevel(Node root, int height) {
		// recursively will be much easier
		if (root == null) {
			return;
		}
		if (height == 1) {
			System.out.println(root.data + " ");
		} else if (height > 1) {
			printGivenLevel(root.left, height - 1);
			printGivenLevel(root.right, height - 1);
		}
	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			int r = height(root.right);
			int l = height(root.left);
			if (r < l) {
				return (l + 1);
			} else {
				return (r + 1);
			}
		}
	}
}
