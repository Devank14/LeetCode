class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int element : arr) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());
        int[] output = new int[k];
        int i = 0;
        while (i < k) {
            output[i] = pq.poll();
            i++;
        }

        return output;

        
    }
}