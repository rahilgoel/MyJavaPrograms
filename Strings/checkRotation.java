
public class checkRotation {
//the most efficient way to solve a question
	
	
	public static void main(String[] args){		
		System.out.println(checkRotation("abcd","bdac"));		
	}
	
	public static boolean checkRotation(String s1,String s2){
		return ((s1.length()==s2.length() && ((s1+s1).indexOf(s2)!=-1)));
		
	}
	
	
	
	
	
	
	
}
