
public class MergeSort {

	public static void main(String[] args){
		//System.out.println("rahil");
		int array[]=new int[]{
				1,6,3,5,2,7,8,9
		};
		int arraySorted[]=MergeSort(array,0,array.length-1);
		for(int x:arraySorted)
		System.out.println(x);		
	}
	public static int[] MergeSort(int[] array,int l,int r){
		if(l<r){
			int m=(l+r)/2;
			MergeSort(array, l, m);
			//System.out.println("rahil2");
			MergeSort(array, m+1, r);
			Merge(array,l,m,r);
			
		}
		return array;
		
	}
	public static void Merge(int[] array,int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++){
			L[i]=array[i+l];
			//System.out.println("rahi3");
		}
		for(int j=0;j<n2;j++){
			R[j]=array[j+m+1];
			//System.out.println("rahil4");
		}
		int a=0,b=0;
		int k=l;
		while(a<n1 && b<n2){
			if(L[a]<R[b]){
				array[k]=L[a];
				a++;
			}
			else{
				array[k]=R[b];
				b++;
			}
			k++;
		}
		while(a<n1){
			array[k]=L[a];
			a++;
			k++;
		}
		while(b<n2){
			array[k]=R[b];
			b++;
			k++;
		}
	}
	
	
}
