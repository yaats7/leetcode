class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            int first=nums[i-1]+nums[i];
            nums[i]=first;
        }
        return nums;
    }
}