class Solution {
    public String triangleType(int[] nums) {
        for(int i=0;i<1;i++)
        {
           if(nums[i]+nums[i+1] > nums[i+2] && nums[i]+nums[i+2] > nums[i+1] && nums[i+2]+nums[i+1] > nums[i] ){
                     if(nums[i]==nums[i+1] && nums[i]==nums[i+2])
                        return "equilateral";
                     else if(nums[i]==nums[i+1] || nums[i]==nums[i+2] || nums[i+2]==nums[i+1]  )
                         return "isosceles";
                     else
                        return "scalene";
                  }
        }
        return "none";
           


        
    }
}