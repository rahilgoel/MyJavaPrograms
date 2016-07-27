import java.util.HashMap;
import java.util.Map;

public class SurpasserCount {

	public static void main(String[] args){
		int array[]=new int[]{
				1,4,4,3,2,5,8,3,6,10
		};
		//NSSurpasserCount(array);
		findSurpasser(array);
				
	}
	public static void NSSurpasserCount(int[] array){
		//int a[]=new int[array.length];
		//n2 solution
		for(int i=0;i<array.length;i++){
			int temp=0;
			for(int j=i+1;j<array.length;j++){
			if(array[i]<array[j]){
				temp++;
			}				
			}
			System.out.println(temp);
		}
	}
	
	//lets try to make a binary search tree
	//you should know how to make binary search tree from an array
	
	// we will make it using linkedlist
	// this was the problem we did using inversion count and merge sort
	//the bigger the smaller elements ahead form the surpasser count so bigger will be n-i-surpasserCount
	//but how to calculate the surpasser count;
	
	public static void findSurpasser(int[] array){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		mergeSort(array,0,array.length,map);
	}
	public static void mergeSort(int[] array,int l,int r,HashMap<Integer,Integer> map){
		
		if(l<r){
			int m=l+(r-1)/2;
			System.out.println(m);
			mergeSort(array,l,m,map);
			mergeSort(array,m+1,r,map);
			Merge(array,l,m,r,map);
			System.out.println(map);						
		}
		
	}
	public static void Merge(int[] array,int l,int m,int r,HashMap<Integer,Integer> map){
		int n1=m-l+1;
		int n2=r-m;
		System.out.println(n1+"rahil "+n2+" "+m);
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;i++){
			L[i]=array[i+l];			
		}
		for(int j=0;j<n2;j++){
			R[j]=array[m+1+j];
		}
		int i=0;
		int j=0;
		int k=l;
		int c=0;
		while(i<n1 && j<n2){
			if(L[i]<R[j]){
				array[k]=L[i];			
				if(map.get(i)!=null){
				int temp=map.get(i);				
				map.put(i, c+temp);}
				else{
					map.put(i,c);
				}
				i++;
			}else{
				c++;
				array[k]=R[j];
				j++;
				
			}
			k++;
		}
		
		while(i<n1){
			array[k]=L[i];
			if(map.get(i)!=null){
			int temp=map.get(i);				
			map.put(i, c+temp);
			}else{
				map.put(i, c);
				
			}
			i++;
			k++;
		}
		while(j<n2)
			array[k++]=R[j++];

		}
	}
	

