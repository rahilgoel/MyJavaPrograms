import java.io.*;
import java.util.*;

public class Contigous {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int array[]=new int[n];
            for(int j=0;j<n;j++){
                array[j]=sc.nextInt();
            }
            System.out.print(contigousSum(array)+" "+nonContigousSum(array));
             System.out.println("");
        }
       
    }
    
    public static int nonContigousSum(int[] array){
        int sum=0;
        boolean flag=false;
        for(int x:array){  
            
            if(sum+x>sum){
                flag=true;
                sum+=x;
            }
        }
        if(flag==true){
            return sum;
        }
        else{
            Arrays.sort(array);
            return array[array.length-1];
        }
       
    }
    //brute force is the only way i guess
    
    public static int contigousSum(int[] array){
        int sum=0;
        boolean flag=false;
        for(int i=0;i<array.length;i++){
        int tempSum=array[i]; 
            //sum=array[i];
            if(tempSum>sum){
                flag=true;
                sum=tempSum;
            }
            for(int j=i+1;j<array.length;j++){
                 tempSum+=array[j];
                //System.out.print(""+tempSum+" ");
                 if(tempSum>sum){
                     flag=true;
                sum=tempSum;
            }
            }
           
        }
        if(flag==false){
            int[] copy=array;
            Arrays.sort(copy);
            return copy[array.length-1];
        }else
        return sum;
    }
}