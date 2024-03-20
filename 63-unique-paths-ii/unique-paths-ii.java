class Solution {
    static int dp[][];
    static int getPath(int i,int j,int grid[][],int m,int n)
    {
        if(i>=m || j>=n)
        {
            return 0;
        }
        if(grid[i][j]==1)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(i==m-1 && j==n-1)
            return 1;
        return dp[i][j]=getPath(i,j+1,grid,m,n)+getPath(i+1,j,grid,m,n);
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
         dp = new int[m][n];
        int i;
        for(i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return getPath(0,0,grid,m,n);
        
    }
}