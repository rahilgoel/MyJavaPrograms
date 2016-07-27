
public class UnderstandingRecurion {

	public static void main(String[] args){


		int[] array={1,2,3,4,5,6,7,8,9};
		System.out.print(traverse(array,8));
	}


	static int traverse(int[] array,int n){

		if(n<0){
			return 1;	
		}
		else{
			traverse(array,--n);
		}
		return 5;
	}





}








