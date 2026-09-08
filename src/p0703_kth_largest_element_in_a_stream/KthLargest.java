package p0703_kth_largest_element_in_a_stream;

import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
    private final int k;
    private final Queue<Integer> minHeap = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) add(num);
    }

    public int add(int val) {
        minHeap.offer(val);

        if (minHeap.size() > k){
            minHeap.poll();
        }

        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */