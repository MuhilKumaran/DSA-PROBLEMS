class Solution 
{
    static int dp[][];
    static int getLength(String t1,String t2,int ind1,int ind2)
    {
        if(ind1>=t1.length() || ind2>=t2.length())
        {
            return 0;
        }
        if(dp[ind1][ind2]!=-1)
            return dp[ind1][ind2];
        if(t1.charAt(ind1)==t2.charAt(ind2))
        {
            return  dp[ind1][ind2] = 1+getLength(t1,t2,ind1+1,ind2+1);
        }
        else
        {
            int q1 = getLength(t1,t2,ind1,ind2+1);
            int q2 = getLength(t1,t2,ind1+1,ind2);
            return dp[ind1][ind2] = Math.max(q1,q2); 
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()][text2.length()];
        int i;
        for(i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return getLength(text1,text2,0,0);
    }
}