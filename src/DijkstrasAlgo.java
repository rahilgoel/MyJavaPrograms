import java.io.*;
import java.util.*;

public class DijkstrasAlgo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
           int[][] adj_mat=new int[n+1][m+1];
           // Arrays.fill(adj_mat,Integer.MAX_VALUE);
              for(int j=0;j<m;j++){
                  int a=sc.nextInt();
                  int b=sc.nextInt();
                  int dis=sc.nextInt();
                  if(dis>adj_mat[a][b] && adj_mat[a][b]!=0){
                 
                  }
                  else{
                       adj_mat[a][b]=dis;
                  adj_mat[b][a]=dis;
                  }
              }
            /*for(int a=0;a<n+1;a++){
                for(int b=0;b<n+1;b++){
                    System.out.print(adj_mat[a][b]);
                }
                System.out.println();
            }*/
            int source=sc.nextInt();
            int[] distance=dijkstras(adj_mat,source,n);
            for(int k=1;k<distance.length;k++){
            if(k!=source){
                if(distance[k]!=Integer.MAX_VALUE){
                System.out.print(distance[k]+" ");
            }else{
                System.out.print(-1);	
            }
        }
        }
        
        }   
    }
   public static int[] dijkstras(int[][] graph,int source,int n){
       int[] distance=new int[n+1];
       boolean[] sptSet=new boolean[n+1];
       
       for(int i=0;i<=n;i++){
           distance[i]=Integer.MAX_VALUE;
           sptSet[i]=false;
       }
       
       distance[source]=0;
       //stpSet[source]=true;
       //for all the vertices...
       
       for(int count=0;count<n;count++){
           
           int u=minDistance(distance,sptSet,n);
           //System.out.println(u+"rahil");
           sptSet[u]=true;
           
           //updating all the adjacent vertices distance
  //System.out.print("start");         0
           for(int v=0;v<n+1;v++){
               //System.out.print("check"+distance[u]+sptSet[v]+graph[u][v]+"distance"+distance[v]);
               if(!sptSet[v] && distance[u]!=Integer.MAX_VALUE && graph[u][v]!=0 && distance[u]+graph[u][v]<distance[v]){
                   
  //System.out.print(distance[u]+" here is it"+distance[v]+" graph "+graph[u][v]);                 
                   
                   distance[v]=distance[u]+graph[u][v];
                    //System.out.println(distance[v]+"vishesh"+v);
               }
              // System.out.print("distance v " + distance[v]+" till here");
           }
           //System.out.print("end");
       }
       
       
       return distance;
       
       
   }
   
    public static int minDistance(int[] distance,boolean[] sptSet,int n){
        
        
        int min=Integer.MAX_VALUE,min_index=-1;
        
        for(int v=0;v<n+1;v++){
            if(distance[v]<=min && !sptSet[v]){
                min=distance[v];
                min_index=v;
            }
        }
        return min_index;
    }
}
