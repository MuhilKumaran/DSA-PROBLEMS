class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        
        int hash[][] = new int[n][11];
        int res=0;
        int i;
        for(int a[] : pick)
        {
            hash[a[0]][a[1]]++;
        }
        for(i=0;i<n;i++)
        {
            for(int num : hash[i])
            {
                if(num>i)
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}