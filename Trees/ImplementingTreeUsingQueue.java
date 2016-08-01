
public class ImplementingTreeUsingTree {
//we will use recursive method to add the values
	public static Node insert(Node root,int data){
		if(root==null){
			root=new Node(data);			
		}
		else {
			if(root.right==null){
				root.right=insert(root.right,data);
			}else{
				root.left=insert(root.left,data);
			}
		}
		return root;
	}
	public static void main(String[] args){
		Node n=new Node(1);
		n=insert(n,2);
		n=insert(n,3);
		n=insert(n,4);
		n=insert(n,5);
		n=insert(n,6);
		n=insert(n,7);
		LevelOrderTraversalTree.levelOrderTraversal(n);
	}
	
	
}
