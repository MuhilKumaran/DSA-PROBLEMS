class Solution {
    public int minimumArea(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int l = cols;
        int r = 0;
        int t = rows;
        int b = 0;

        for(int ro=0;ro<rows;ro++)
        {
            for(int c=0;c<cols;c++)
            {
                if(grid[ro][c]==1)
                {
                    l=Math.min(l,c);
                    r=Math.max(r,c);
                    t=Math.min(t,ro);
                    b=Math.max(b,ro);
                }
            }
        }
        int h= b-t+1;
        int w= r-l+1;
        return h*w;
    }
}