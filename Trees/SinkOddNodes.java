import java.util.*;
public class SinkOddNodes {

	public static void SinkOddNodes(Node root){
		
	/*	my idea is to store the odd in seperate list and even in
		other list and then construct the tree again with even above and 
		odd below*/
		List<Node> listEven=new ArrayList<Node>();
		List<Node> listOdd=new ArrayList<Node>();
		Node cur=root;
		while(cur!=null){
			if(cur.data%2==0){
				listEven.add(cur);
				
			}
			else{
				listOdd.add(cur);
			}
			
		}
	}
	public void makingList(Node root,List odd,List even){
		if(root==null){
			return ;
		}
		else{
			
		}
	}
	
	
}
