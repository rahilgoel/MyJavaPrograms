import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromCurrentString {

	public static void main(String[] args){
		System.out.println(removeDuplicates("my name is rrahil goel"));
		maintainOrder("geeks");
	}
	public static String removeDuplicates(String s){
		char[] array=s.toCharArray();
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<array.length;i++){
			set.add(array[i]);
		}
		String res="";
		Iterator it=set.iterator();
		while(it.hasNext()){
			res+=it.next();
		}
		return res;
	}
	public static void maintainOrder(String s){
		//we have to do it by normal hashing also but we used the property of the hash set that we can do what we want to do
		//let us try by going on with hashing 
		Map<Character,Boolean> map=new LinkedHashMap<Character,Boolean>();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(map.get(ch[i])==null){
				map.put(ch[i], true);				
			}
		}
		System.out.println(map);
	}
}
