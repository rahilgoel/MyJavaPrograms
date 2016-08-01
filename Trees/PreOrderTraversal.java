 
public class PreOrderTraversal {
	 
	
		public static void main(String[] args){
			Node n=new Node(1);
			n.left=new Node(2);
			n.right=new Node(3);
			print(n);
		}
		public static void print(Node root){
			if(root!=null){
				System.out.println(root.data);
				print(root.left);
				print(root.right);
			}
			
	}
	
	
	
	
	
	
	
	
}
