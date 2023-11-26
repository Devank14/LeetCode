import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i], val);
            }else{
                map.put(arr[i], 1);
            }
        }
        
        int setSize = 0;
        int total = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(Integer val : map.values()){
            pq.add(val);
        }
        
        while(total < arr.length/2){
            total = total + pq.poll();
            setSize++;
        }
        
        return setSize;
        
        
    }
}