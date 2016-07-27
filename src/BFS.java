import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	
	
	//we need adjacency matrix which shows adjacent vertex to a particular element and a visited array.
	//all the nodes are visited from above and one by one.
	
	
	private Queue<Integer> queue;
	
	public BFS(){
		queue=new LinkedList<Integer>();
			
	}
	public void bfs(int adjacency_matrix[][],int source){		
		int number_of_nodes=adjacency_matrix[source].length-1;
		int visited[]=new int[number_of_nodes+1];
		visited[source]=1;
		int i, element;
		queue.add(source);
		while(!queue.isEmpty()){
			element=queue.remove();
			i=element;
			System.out.print(element+"\t");
			while(i<number_of_nodes){				
				if(adjacency_matrix[element][i]==1 && visited[i]==0){
					queue.add(i);
					visited[i]=1;
				}
				i++;
			}
		}
	}

}
