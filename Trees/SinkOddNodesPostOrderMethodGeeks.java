
public class SinkOddNodesPostOrderMethodGeeks {

	
	/*we will use postOrder traversal and try to sink a single node and then
	try to sink all the nodes
	*/
	
	public static void main(String[] args){
		Node n=new Node(1);
		n.left=new Node(7);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.left.right.right=new Node(6);
		sinkOddNodes(n);
		LevelOrderTraversalTree.levelOrderTraversal(n);
				
	}
	public static boolean isLeaf(Node node){
		return (node.left==null && node.right==null);
	}
	
	
	public static void sink(Node root){
		
		if(isLeaf(root)|| root==null){
			return;
		}
		
		//if the left subtree exist and it is even then exchange it 
		if(root.left!=null && (root.left.data & 1)==0){
			int temp=root.data;
			root.data=root.left.data;
			root.left.data=temp;
		//swap(root.data,root.left.data);
		sink(root.left);
						
		}
		if(root.right!=null && (root.right.data%2==0)){
			//swap(root.data,root.right.data);
			int temp=root.data;
			root.data=root.right.data;
			root.right.data=temp;
			sink(root.right);
		}
				
	}
	public static void sinkOddNodes(Node root){
		if(root==null || isLeaf(root)){
			return;
		}
		sinkOddNodes(root.left);
		sinkOddNodes(root.right);
		if((root.data & 1)!=0){
			sink(root);
		}
				
	}
	
	
}
