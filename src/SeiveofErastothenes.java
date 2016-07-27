import java.util.Arrays;

public class SeiveofErastothenes {

	public static void main(String[] args){
		primes(100);
		
	}
	
	public static void primes(int n){
		
		
		boolean[] sieve=new boolean[n+1];
		for(int i=0;i<=n;i++)
		{
			sieve[i]=true;
		}
		
		for(int p=2;p*p<=n;p++)
		{
			if(sieve[p]==true){
				for(int i=p*2;i<=n;i=i+p){
					sieve[i]=false;
				}
			}
									
		}
		for(int a=1;a<n+1;a++){
			if(sieve[a]==true){
				System.out.print(a+" ");
			}
		}
	}
//	public static void alterState(int p,int[] array,int n){
//		int i=1;
//		while(i*p<n){
//			array[i*p]=1;
//			i++;			
//		}		
//	}
	
	
	
	
}
