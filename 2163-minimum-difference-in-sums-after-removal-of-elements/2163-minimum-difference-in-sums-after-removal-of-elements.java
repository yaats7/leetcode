class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        int size = nums.length;
        long[] leftMin = new long[size];
        long[] rightMax = new long[size];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long leftSum = 0;
        for (int i = 0; i < size; i++) {
            maxHeap.offer(nums[i]);
            leftSum += nums[i];
            if (maxHeap.size() > n) 
            {
                leftSum -= maxHeap.poll();
            }
            if (maxHeap.size() == n) 
            {
                leftMin[i] = leftSum;
            }
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long rightSum = 0;
        for (int i = size - 1; i >= 0; i--) 
        {
            minHeap.offer(nums[i]);
            rightSum += nums[i];
            if (minHeap.size() > n) 
            {
                rightSum -= minHeap.poll();
            }
            if (minHeap.size() == n) 
            {
                rightMax[i] = rightSum;
            }
        }
        long result = Long.MAX_VALUE;
        for (int i = n - 1; i < 2 * n; i++) 
        {
            result = Math.min(result, leftMin[i] - rightMax[i + 1]);
        }
        return result;
    }
}