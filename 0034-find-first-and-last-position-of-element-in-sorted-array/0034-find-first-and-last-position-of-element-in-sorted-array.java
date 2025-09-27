class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fir=-1,last=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(fir==-1)
                    fir=last=i;
                else
                    last=i;
            } 
        }
        return new int[]{fir,last};
        
    }
}