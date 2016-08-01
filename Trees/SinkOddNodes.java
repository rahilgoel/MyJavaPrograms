import java.util.*;
public class SinkOddNodes {
	
	public static void main(String args[]){
		Node root=new Node(1);
		root.left=new Node(3);
		root.right=new Node(6);
		root.left.left=new Node(4);
		root.right.right=new Node(6);
		Node rootnew=SinkOddNodes(root);
		//PreOrderTraversal pot=new PreOrderTraversal();
		//pot.print(root);
	LevelOrderTraversalTree.levelOrderTraversal(rootnew);
	}
	
	
	public static Node buildTree(Queue<Node> q1,Queue<Node> q2){
		Node n=new Node(q2.poll().data);
		while(!q2.isEmpty()){
			ImplementingTreeUsingTree.insert(n, q2.poll().data);
		}
		while(!q1.isEmpty()){
			ImplementingTreeUsingTree.insert(n,q1.poll().data);
		}
		return n;
	}
	
	
	public static Node SinkOddNodes(Node root){
		
	/*	my idea is to store the odd in seperate list and even in
		other list and then construct the tree again with even above and 
		*/
		Queue<Node> q1=new LinkedList<Node>();
		Queue<Node> q2=new LinkedList<Node>();
	makingList(root,q1,q2);
	//check(q1);
		//Node cur=q2.poll();
	/*	while(!q2.isEmpty()){
			cur.left=q2.poll();
			cur.right=q2.poll();
		}
		while(!q1.isEmpty()){
			cur.left=q1.poll();
			cur.right=q1.poll();
		}*/
	Node cur=buildTree(q1, q2);
		
		return cur;
		
	}
	public static void check(Queue<Node> test){
		while(!test.isEmpty()){
			System.out.println(test.poll().data);
		}
	}
	public static void makingList(Node root,Queue odd,Queue even){
		if(root!=null){
		
			if(root.data%2==0){
				even.add(root);
		}else{
			odd.add(root);
		}
			makingList(root.left, odd, even);
			makingList(root.right,odd,even);
				
		}
		
		}
	}
	
	

