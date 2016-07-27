import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myBufferedReader {
public static void main(String[] args){
	
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try {
		String s=br.readLine();
		System.out.println(s);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
}
}
