import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {

	class Node {
		int data;
		Node right;
		Node left;

		public Node newNode(int data) {
			Node n = new Node();
			n.data = data;
			n.right = n.left = null;
			return n;
		}
	}

	public static int heightR(Node root) {
		if (root == null) {
			return 0;
		} else {
			int lHieght = heightR(root.left);
			int rHeight = heightR(root.right);
			if (lHieght > rHeight) {
				return (lHieght + 1);
				// else incorporates the case where they both are equal which is
				// in the starting so thats is important
			} else {
				return (rHeight + 1);
			}
		}

	}

	public static int heightI(Node root) {
		// we will use queue
		int height=0;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(1==1){
			int nodeCount=q.size();
			
			if(nodeCount==0){
				return height;
			}
			height++;
			//dequeue nodes of current level and enqueue all nodes of the next level
			while(nodeCount>0){
				Node n=q.poll();
				if(n.left!=null){
					q.add(n.left);
				}if(n.right!=null){
					q.add(n.right);
				}
				nodeCount--;
			}
		}
	}
}
