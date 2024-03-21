class Solution 
{
    static int dp[][];
    // static int getLength(String t1,String t2,int ind1,int ind2)
    // {
    //     if(ind1>=t1.length() || ind2>=t2.length())
    //     {
    //         return 0;
    //     }
    //     if(dp[ind1][ind2]!=-1)
    //         return dp[ind1][ind2];
    //     if(t1.charAt(ind1)==t2.charAt(ind2))
    //     {
    //         return  dp[ind1][ind2] = 1+getLength(t1,t2,ind1+1,ind2+1);
    //     }
    //     else
    //     {
    //         int q1 = getLength(t1,t2,ind1,ind2+1);
    //         int q2 = getLength(t1,t2,ind1+1,ind2);
    //         return dp[ind1][ind2] = Math.max(q1,q2); 
    //     }
    // }
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()+1][text2.length()+1];
        int i,j;
        // for(i=0;i<dp.length;i++)
        // {
        //     Arrays.fill(dp[i],-1);
        // }
        // return getLength(text1,text2,0,0);
        int m=text1.length();
        int n=text2.length();
        for(i=0;i<=m;i++)
        {
            for(j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}