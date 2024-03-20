class Solution {
    static int getAns(int nums[],int ind,int dp[])
    {
        if(ind>=nums.length)
            return 0;
        if(dp[ind]!=-1)
            return dp[ind];
        int pick= nums[ind]+getAns(nums,ind+2,dp);
        int notpick= getAns(nums,ind+1,dp);;
        dp[ind]=  Math.max(pick,notpick);
        return dp[ind];
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        int i;
        for(i=0;i<nums.length;i++)
        {
            dp[i]=-1;
        }
        return getAns(nums,0,dp);
    }
}