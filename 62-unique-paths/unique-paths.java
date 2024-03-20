class Solution {
    static int dp[][];
    // static int getPath(int i,int j,int m,int n)
    // {
    //     if(i>=m || j>=n)
    //         return 0;
    //     if(i==m-1 &&j==n-1)
    //         return 1;
    //     if(dp[i][j]!=-1)
    //         return dp[i][j];
    //    return dp[i][j] = getPath(i,j+1,m,n) + getPath(i+1,j,m,n);
    // }

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        int i,j;
        // for(i=0;i<m;i++)
        // {
        //     Arrays.fill(dp[i],-1);
        // }
        // return getPath(0,0,m,n);
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=1;
                }     
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}