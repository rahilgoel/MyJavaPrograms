
public class MaxValueKSuchThatArrayHasAtleastKelementsGreaterthanOrEqualToK {

	
	public static void main(String[] args){
		int[] array=new int[]{
				1, 2, 3, 8, 10, 5
		};
		//System.out.println(n2sol(array));
		System.out.println(nsol(array,6));
	}
	
	public static int n2sol(int[] array){
		int a=0;		
		for(int i=array.length-1;i>=1;i--){			
			for(int j=0;j<array.length;j++){
				if(i<array[j]){
					a++;
				}
			}
			if(a>=i){
				return i;
			}				
			
		}
		return 1;		
	}
	public static int nsol(int[] array,int n){
		int[] freq=new int[n+1];
		for(int i=0;i<n;i++){
			if(array[i]<n){
				freq[array[i]]++;
			}
			else{
				freq[n]++;
			}
		}
		
		int sum=0;
		for(int j=n;j>0;j--){
			sum+=freq[j];			
			if(sum>=j){
				return j;
			}
			
		}
		return 1;
	}
	
	
}
