class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int temp=0;
        for(int i=0;i<n;i++){
            arr[temp++]=nums[i];
            arr[temp++]=nums[i+n];            
        }
        return arr;
    }
}