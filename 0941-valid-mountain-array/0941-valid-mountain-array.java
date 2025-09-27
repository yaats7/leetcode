class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length>=3)
        {
            if(arr[arr.length-1]>arr[arr.length-2])
            {
                return false;
            }
            if(arr[0]>arr[1])
            {
                return false;
            }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
                continue;
            else if(arr[i]==arr[i+1])
                return false;
            else
            { 
                int res=i;
                for(int j=res;j<arr.length-1;j++)
                    {
                        if(arr[j]>arr[j+1])
                            continue;
                        else 
                            return false;
                    }
                break;
            }
        }  
        } 
    
        else
            return false;
        return true;
    }
    
}