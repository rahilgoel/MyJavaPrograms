import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingSingleQueue {
public static void main(String[] args){
	
	
	
	MyStack stk=new MyStack();
	stk.push(10);
	stk.push(20);
	System.out.println(stk.top());
	stk.pop();
	System.out.println(stk.top());
	
}
	
	// Need to use queue to generate a functionality like a stack
	//push and pop methods to be written and should use array queue and d
	//x is to be pushed and s is the stack
	// in a stack queue an element and then continously dequeue and enqueue the elements
	
	static class MyStack{
		Queue<Integer> q;
		MyStack(){
		q=new LinkedList<Integer>(); 
		
		}
		
		
		void push(int x){
			int s=q.size();
			q.add(x);
			for(int i=0;i<s;i++){
				q.add(q.peek());
				q.remove();
			}						
		}
		
		void pop(){
			if(q.isEmpty()){
				System.out.println("no element");
			}else{
				q.remove();
			}
		}
		
		int top(){
			return (q.isEmpty()?-1:q.peek());
		}
		boolean empty(){
			return (q.isEmpty());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
