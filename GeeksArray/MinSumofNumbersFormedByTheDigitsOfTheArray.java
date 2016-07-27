import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MinSumofNumbersFormedByTheDigitsOfTheArray {

	public static void main(String[] args){
		int[] array=new int[]{
				6, 8, 4, 5, 2, 3
		};
		
		System.out.println(minSum(array));
	}
	
	public static int minSum(int[] array){
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		//it sorts in the non dec order;
		Arrays.sort(array);
		//System.out.println(array[0]);
		int n=0;
		while(n<array.length){
			list1.add(array[n]);
			n++;
			if(n<=array.length-1){
			list2.add(array[n]);
			n++;
			}
		}
int a=formNumberFromList(list1);
int b=formNumberFromList(list2);

	return a+b;	
	}
public static int formNumberFromList(List l){

	Iterator it=l.iterator();
	String s="";
	while(it.hasNext()){
		s+=it.next().toString();
	}
	System.out.println(s);
	return Integer.parseInt(s);
}
	
	
	
	
	
	
}
