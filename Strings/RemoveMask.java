//there can only be one public class in java

import java.util.*;
public class RemoveMask {


	public static void main(String[] args){
		System.out.println(removeMask("rahil", "lahr"));
	}
	
public static String removeMask(String input,String mask){
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	for(int i=0;i<mask.length();i++){
		map.put(mask.charAt(i), 1);		
	}
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<input.length();i++){
		if(!map.containsKey(input.charAt(i))){
			sb.append(input.charAt(i));
		}
	}
	return sb.toString();
}
	
	
	
}
