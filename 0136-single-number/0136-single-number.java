class Solution {
    public int singleNumber(int[] nums) {
        int tar=nums[0];
        if(nums.length==1)
            return tar;
        for(int i=0;i<nums.length;i++)
        { 
           
            int count=1;
            tar=nums[i];
            for(int j=i+1;j<nums.length;j++)
            { 
               
                if(nums[i]==-99)
                {
                    i++;
                    tar=nums[i];
                }
                else if(nums[i]==nums[j])
                {
                    nums[j]=-99;
                    count++;
                    break;
                }  
                else 
                {
                    continue;
                }
            }
            if(count==1)
                return tar;
        }
       return 0;
    }
}