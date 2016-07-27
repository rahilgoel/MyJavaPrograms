import java.util.Scanner;

public class connectingTownsHackerrank {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        for(int i=0;i<t;i++){
	            int n=sc.nextInt();
	            double product=1;
	            for(int j=0;j<n-1;j++){
	                product*=sc.nextInt();
	                
	            }
	            
	            System.out.println(product%1234567);
	        }
	            
	    }
	
	
}
