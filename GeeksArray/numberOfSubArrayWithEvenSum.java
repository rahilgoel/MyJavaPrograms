
public class numberOfSubArrayWithEvenSum {


	public static void main(String[] args){
		int array[]=new int[]{
				1, 2, 2, 3, 4, 1
		};
		System.out.println(withEvenSum(array));
	}
	public static int withEvenSum(int[] array){
		
		
		int evenOdd[]=new int[]{
				1,0
		};
		int sum=0,result=0;
		for(int i=0;i<array.length;i++){
			sum=(((sum+array[i])%2)+2)%2;
			evenOdd[sum]++;
			}
		result+=evenOdd[1]*(evenOdd[1]-1)/2;
		result+=evenOdd[0]*(evenOdd[0]-1)/2;
		return result;		
		
		}
		
		
		
	}
	
	

