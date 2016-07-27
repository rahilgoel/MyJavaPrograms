
public class RemakingOfTree {
	//making back of the tree by inorder and post order traversal
	static int pIndex;
	public static void main(String[] args){
		int in[]={4,8,2,5,1,6,3,7};
		int post[]={8,4,5,2,6,7,3,1};
		pIndex=in.length-1;
		Node root=BuildUtil(in,post,pIndex,0,in.length-1);
		System.out.println(" "+root.data+ " "+root.left.data+ root.right.data+root.left.left.data+root.right.left.data);
		preorder(root);
	}
	
	static void preorder(Node root){
		if(root==null){
			return ;		 
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);	
	}
	//make a method that returns all the values of the tree
	static Node BuildUtil(int in[],int post[],int pIndex,int inStart,int inEnd){
		//	i am planning a recursive call so i need a base statement 
		if(inStart>inEnd){
			return null;
		}

		//because i am returning a node so i have to make a node by every means...
		Node node=newNode(post[pIndex]);
		pIndex--;

		//if this is the only node in in[] then return this only else make a recursive call to the method.
		if(inStart==inEnd){
			return node;
		}

		int iIndex=search(in,inStart,inEnd,node.data);
		System.out.println("search: "+iIndex);
		node.right=BuildUtil(in, post, pIndex, iIndex+1, inEnd);
		node.left=BuildUtil(in, post, pIndex, inStart, iIndex-1);
		System.out.println("the value oof the node is: "+ node.data);
		return node;
	}

	static int search(int in[],int inStart,int inEnd,int data){

		int index;;
		for(index=inStart;index<=inEnd;index++){
			if(in[index]==data){
				break;
			}
		}
		return index;
	}

	static Node newNode(int data){
		Node node =new Node();
		node.data=data;
		node.left=node.right=null;
		return node;
	}
}
class Node{

	int data;
	Node left;
	Node right;


}

