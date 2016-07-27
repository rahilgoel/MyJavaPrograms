import java.util.*;
import java.lang.*;

class SieveSpoj
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
			//System.out.println("Rahil");
			int t=sc.nextInt();
			for(int i=0;i<t;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				//System.out.println("Rahil");
				int[] array=Sieve(b);
				//System.out.println("Rahil");
				for(int j=a;j<=b;j++){
					if(array[j]==1 && j!=1){
					System.out.println(j);
					}
				}
				System.out.println();
			}			
	}
	
	public static int[] Sieve(int n){	
		//System.out.println("Rahil");
	int array[]=new int[n+1];
	Arrays.fill(array,1);
	for(int p=2;p*p<=n;p++){		
		if(array[p]==1){
			for(int i=2*p;i<=n;i+=p){
			array[i]=0;	
			}
		}
	}
	return array;
	} 
}