class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int i;
        int j;
        for(j=0;j<grid[0].length;j++)
        {
            for(i=0;i<grid.length-1;i++)
            {
                if(grid[i][j]!=grid[i+1][j])
                {
                    return false;
                }
            }
        }
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[i].length-1;j++)
            {
                if(grid[i][j]==grid[i][j+1])
                {
                    return false;
                }
            }
        }
        return true;
    }
}