class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum1=0,sum;
        for(int i=0;i<accounts.length;i++)
        {
            sum=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(sum1<sum)
                sum1=sum;
        }
        return sum1;  
    }
}