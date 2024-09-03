class Pair{
    int row;
    int col;
    int time;
    Pair(int r,int c,int t)
    {
        row=r;
        col=c;
        time=t;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean visited[][] = new boolean[m][n];
        Queue<Pair> qu = new LinkedList<>();
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    qu.add(new Pair(i,j,0));
                    visited[i][j]=true;
                }
            }
        }

        int drow[] = new int[]{-1,0,1,0};
        int dcol[] = new int[]{0,1,0,-1};
        int dist[][] = new int[m][n];
        while(!qu.isEmpty())
        {
            int row=qu.peek().row;
            int col=qu.peek().col;
            int time=qu.peek().time;
            qu.remove();
            dist[row][col]=time;
            for(i=0;i<4;i++)
            {
                int nrow=row+drow[i];
                int ncol=col+dcol[i];

                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && !visited[nrow][ncol])
                {
                    visited[nrow][ncol]=true;
                    qu.add(new Pair(nrow,ncol,time+1));
                }
            }
        }

        return dist;
    }
}