
public class SumInArrayRotation {

	public static void main(String[] args){
		int[] arr=new int[]{
				8,3,1,2
		};
		System.out.println(maxSumGeek((arr)));
	}
	
	//max sum of i*arr[i] among all rotations of a given array...
	//typical n2 solution
	public static int maxSum(int array[])
	{
	int res=Integer.MIN_VALUE;
	
	for(int i=0;i<array.length;i++){
	//this is all the rotations and the next one is for the every rotation
	int sum=0;
	for(int j=0;j<array.length;j++){
		sum+=j*array[(i+j)%array.length];
	}
	res=Math.max(res, sum);
	}
	return res;
	}
	
	//O(n) solution
	//idea of dynamic programing calculating the sum from the previous value
	public static int maxSumGeek(int[] array){
		int current_sum=0;
		for(int i=0;i<array.length;i++){
			current_sum+=array[i];
		}
		
		int curr_value=0;
		for(int i=0;i<array.length;i++){
			curr_value+=i*array[i];
		}
		int res=Integer.MIN_VALUE;
		for(int i=1;i<array.length;i++){
		int sum=0;
		sum=curr_value-(current_sum-array[i-1])+array[i-1]*(array.length-1);
		curr_value=sum;
		res=Math.max(res, sum);
		}
		
		return res;
	}
	
}
