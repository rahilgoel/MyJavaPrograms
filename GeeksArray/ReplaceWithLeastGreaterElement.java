
public class ReplaceWithLeastGreaterElement {

	public static void main(String[] args){
		int[] array=new int[]{8,58,71,18,31,32,63,92,43,3,91,93,25,80,28};
		// time complexity n2;
		my_replace(array);
	}
	
	class Node{
		int data;
		Node left,right;
		
	}
	Node newNode(int item){
		Node tmp=new Node();
		tmp.data=item;
		tmp.right=tmp.left=null;
		return tmp;
		
	}
	
	void insert(Node node,int data, Node succ){
		if(node==null){
			node=newNode(data);
		}
		if(data<node.data)
		{
			succ=node;
			insert(node.left,data,succ);
			
		}else if(data>node.data){
			insert(node.right,data,succ);
		}
	}
	
	
	public static void my_replace(int[] array){
		
		for(int i=0;i<array.length;i++){
			int a=array[i];
			int temp=Integer.MAX_VALUE;
			int index=0;
			for(int j=i;j<array.length;j++){
			if(array[j]<temp){				
				if(array[j]>a){
					temp=array[j];
					index=j;
				}				
				if(temp!=Integer.MAX_VALUE){
			}				
			
			//array[index]=a;
			array[i]=temp;
		}else{
			array[i]=-1;
		}
		}

		for(int x:array){
			System.out.print(x+" ");
		}

	}
	
}
	}
