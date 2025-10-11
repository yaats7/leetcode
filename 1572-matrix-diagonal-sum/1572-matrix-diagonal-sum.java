class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        int size=mat.length;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==j || i+j==size-1)
                {
                    ans+=mat[i][j];
                }
                
            }
        }
        return ans;
    }
}