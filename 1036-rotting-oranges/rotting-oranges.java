class Pair
{
    int r;
    int c;
    int t;
    Pair(int r,int c,int t)
    {
        this.r=r;
        this.c=c;
        this.t=t;
    }
}
class Solution {
    static int maxTime;
    public int orangesRotting(int[][] grid) {
        maxTime=0;
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        int cnt=0;
        int i,j;
        boolean visited[][] = new boolean[n][m];
        Queue<Pair> q = new LinkedList<Pair>();
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    visited[i][j]=true;
                }
                else
                {
                    visited[i][j]=false;
                }
                if(grid[i][j]==1)
                    fresh++;
                
            }
        }
        int drow[]=new int[]{-1,0,1,0};
        int dcol[]=new int[]{0,1,0,-1};
        while(!q.isEmpty())
        {
            Pair temp =q.remove();

            int r=temp.r;
            int c=temp.c;
            int t=temp.t;
            maxTime=Math.max(maxTime,t);
            for(int k=0;k<4;k++)
            {
                int nrow=r+drow[k];
                int ncol=c+dcol[k];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !visited[nrow][ncol] && grid[nrow][ncol]==1)
                {
                    cnt++;
                    visited[nrow][ncol]=true;
                    q.add(new Pair(nrow,ncol,t+1));
                }
            }
        }
        if(cnt!=fresh)
            return -1;
        return maxTime;
    }
}