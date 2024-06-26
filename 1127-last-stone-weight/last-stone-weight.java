class Solution {
    public int lastStoneWeight(int[] stones) {
        // Creating a max heap using PriorityQueue by passing a reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        
        // Process the stones until there is 0 or 1 stone left
        while (maxHeap.size() > 1) {
            int y = maxHeap.poll(); // The heaviest stone
            int x = maxHeap.poll(); // The second heaviest stone
            
            if (x != y) {
                maxHeap.add(y - x); // Add the remaining weight back to the heap
            }
        }
        
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}