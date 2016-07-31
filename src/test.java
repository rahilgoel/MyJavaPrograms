import java.io.*;
import java.util.*;

public class test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       int i=2;
       if((i & 1)==0){
    	   System.out.println("gdff");
       }
       List<Integer> add=new ArrayList<Integer>();
       add.add(1);
       addM(add);
       for(int j=0;j<add.size();j++){
    	   System.out.println(add.get(j));
       }

        }
    public static void addM(List add){
    	add.add(4);
    }
    }
