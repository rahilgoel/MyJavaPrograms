import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxOccuringChar {

	public static void main(String[] args){
		
		
		
		System.out.println(maxOccuringChar("rraahhiill is a bad boyy"));
	}
	public static char maxOccuringChar(String s){
		//we will do hashing 
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++){
			if(map.get(arr[i])==null){
				map.put(arr[i], 1);
			}
			else{
				int a=map.get(arr[i]);
				map.put(arr[i], ++a);
			}
			
		}
		Iterator it=map.entrySet().iterator();
		int max=-1;
		char temp='0';
		while(it.hasNext()){
			Map.Entry pair=(Map.Entry)it.next();
			if((int)pair.getValue()>max){
				max=(int)pair.getValue();
				temp=(char)pair.getKey();
			}
			
		}
		System.out.println(map);
		return temp;
		
	}
	
	
}
