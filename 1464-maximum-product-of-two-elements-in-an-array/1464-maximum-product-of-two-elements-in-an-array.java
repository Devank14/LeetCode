class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(Integer number : nums){
            queue.add(number);
        }
        
        int one = queue.remove() -1;
        int two = queue.remove() -1;
        
        return one*two;
    }
}