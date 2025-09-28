class Solution {
    public boolean isMonotonic(int[] nums) {
        for(int j=0;j<nums.length-1;j++)
        {
            if(nums[j]==nums[j+1])
                continue;
            else if(nums[j]<nums[j+1])
            {
                for(int i=j+1;i<nums.length-1;i++)
                {
                    if(nums[i-1]<=nums[i] && nums[i]<=nums[i+1])
                        continue;
                    else
                        return false;
                }
                 return true;
            }
            else if(nums[j]>nums[j+1])
            {
                for(int i=j+1;i<nums.length-1;i++)
                {
                    if(nums[i-1]>=nums[i] && nums[i]>=nums[i+1])
                        continue;
                    else
                        return false;
                }
                return true;
            }
        return true;
        }
        
     return true;        
    }
}