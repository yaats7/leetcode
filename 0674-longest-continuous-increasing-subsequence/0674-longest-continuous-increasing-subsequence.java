class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int result = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i-1] < nums[i]) result = Math.max(result, ++count);
            else count = 1;
        }
        return result;
    }
}