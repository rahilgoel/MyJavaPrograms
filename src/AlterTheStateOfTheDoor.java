import java.util.Arrays;
import java.util.Scanner;

public class AlterTheStateOfTheDoor {
	
	//code
	
    public static int alterTheState(boolean[] array,int n) {
		int i=0;
		int j=1;
		while(j<=n){
			while(i<n){
				array[i]=!array[i];
				i=i+j;
			}
			i=j;
			j++;
			
		}		
		int open=0; 
		for(boolean x:array){
			if(x)
				open++;
		}
		
		return open;
	}
    
    
	public static void main (String[] args) {
		//code
		long startTime = System.nanoTime();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    boolean array[]=new boolean[n];
		    Arrays.fill(array,false);
		    System.out.println(alterTheState(array,n));
		}
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
	
	
}