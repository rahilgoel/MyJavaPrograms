import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	public static <E> void main(String[] args){
		
		
		
		int[] array=new int[]{
				3,5,7,2,2,5,7,7
		};
		
		Set list=removeDuplicates(array);
		
		Iterator<E> it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
	public static Set<Integer> removeDuplicates(int[] array){
		
		Set<Integer> list=new HashSet<Integer>();
		
		for(int i=0;i<array.length;i++){
			list.add(array[i]);
		}
		
		
		
		
		return list;
		
	}
}
