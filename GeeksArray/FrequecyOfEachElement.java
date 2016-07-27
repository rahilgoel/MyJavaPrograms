import java.util.*;
public class FrequecyOfEachElement {
public static void main(String[] args){
	
	
	
	int[] array=new int[]{
			1, 1, 1, 2, 3, 3, 5,
            5, 8, 8, 8, 9, 9, 10
	};
	System.out.println(withHashing(array));
	
}

public static Map<Integer,Integer> withHashing(int[] array){	
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	for(int i=0;i<array.length;i++){
		if(map.get(array[i])!=null){
			int a=map.get(array[i])+1;
			map.put(array[i], a);
		}else{
			map.put(array[i], 1);
		}		
	}
	return map;
	
}
public static Map


}
