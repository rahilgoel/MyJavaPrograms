import java.util.Scanner;

public class myProduct {

	public static boolean checkProduct(int array[],int product){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(i==j){
					
				}else{
					if(product==array[i]*array[j]){
						return true;
					}
				}
				
			}
		}
		
		return false;		
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){			
			int n=sc.nextInt();
			int p=sc.nextInt();
			int array[]=new int[n];
			for(int j=0;j<n;j++){
				array[j]=sc.nextInt();
			}
			if(checkProduct(array, p)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}				
	}
	
	
}
