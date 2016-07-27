import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AllSubArrayWithSumZero {

	public static void main(String[] args){
		int[] array=new int[]{
				6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7	
		};
		
		Map map=findSubArrays(array);
			//System.out.println(map);
			Iterator it=map.entrySet().iterator();
			while(it.hasNext()){
				Map.Entry pair=(Map.Entry) it.next();
				System.out.println(pair.getKey()+" "+pair.getValue());
			}
			
		}
	
	public static Map<Integer,Integer> findSubArrays(int[] array){		
		Map<Integer,Integer> list=new HashMap<Integer,Integer>();
		Map<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
		int sum=0;
		for(int i=0;i<array.length;i++){
		sum+=array[i];
		if(sum==0){
			//Map<Integer,Integer> temp_map=new HashMap<Integer,Integer>();
			//temp_map.put(0, i);
			//list.add(temp_map);
			list.put(0, i);
		}
		
		if(map.containsKey(sum)){			
			List<Integer> vc=map.get(sum);
			for(int j=0;j<vc.size();j++){
				//Map<Integer,Integer> temp_map=new HashMap<Integer,Integer>();
				//temp_map.put(vc.get(j)+1, i)
				//;
				list.put(vc.get(j)+1,i);
				//System.out.print(list.get(0));
			}
		}
		
		if(map.get(sum)!=null)
		map.get(sum).add(i);
		else{
			List temp_list=new ArrayList<Integer>();
			temp_list.add(i);
			map.put(sum, temp_list);
		}
		}		
		return list;
		
	}
	
	
}
