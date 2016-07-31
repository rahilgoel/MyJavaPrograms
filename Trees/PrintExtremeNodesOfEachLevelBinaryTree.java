import java.util.LinkedList;
import java.util.Queue;

public class PrintExtremeNodesOfEachLevelBinaryTree {
	 
	public static void main(String[] args){
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7);
		n.right.right.right=new Node(8);
		printExtremeNodes(n);
		
	}
	static class Node {
		int data;
		Node right;
		Node left;
		Node(int n){
			data=n;
			right=left=null;
		}
	}

	

	public static void printExtremeNodes(Node root) {
		// implementation by a queue
		// level order traversal by the tree
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			int nodeCount = q.size();
			int n = nodeCount;
			boolean flag = true;
			while (n-- >0) {
				Node nodetemp = q.poll();
				if (nodetemp.left != null) {
					q.add(nodetemp.left);
				}
				if (nodetemp.right != null) {
					q.add(nodetemp.right);
				}
				if (flag && n == nodeCount - 1) {
					System.out.println(nodetemp.data);
				}
				if (!flag && n == 0) {
					System.out.println(nodetemp.data);
				}

			}

		}

	}

}
