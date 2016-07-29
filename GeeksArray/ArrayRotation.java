public class ArrayRotation {
	//print all the rotations of the array
	//number of rotations will be the no of elements-1
	public static void main(String[] args){
		int[] array=new int[]{
				3,4,5,6,7,8
		};
		rotateAndPrint(array);
	}
	public static void rotateAndPrint(int[] array){
		
		for(int i=0;i<=5;i++){
			
			for(int j=0;j<array.length-1;j++){
				int temp=(j+1)%array.length;
				int a=array[temp];
				array[temp]=array[j];
				array[j]=a;
			}
			print(array);
			
			
		}
		
	}
	
	static void  print(int[] array){
		for(int x:array){
			System.out.print(x+" ");
		}
		System.out.println("");
	}
	
}
