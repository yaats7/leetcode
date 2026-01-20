class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] aar=new int[nums.size()];
        for(int i=0;i<nums.size();i++)
        {
            for(int j=1;j<nums.get(i);j++){
                if((j | (j+1))==nums.get(i)){
                     aar[i]=j;
                     break;
                }
                if(j==nums.get(i)-1)
                    aar[i]=-1;  
            }
        }
        return aar;
    }
}