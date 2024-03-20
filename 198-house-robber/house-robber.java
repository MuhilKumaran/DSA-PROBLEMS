class Solution {
    // static int getAns(int nums[],int ind,int dp[])
    // {
    //     if(ind>=nums.length)
    //         return 0;
    //     if(dp[ind]!=-1)
    //         return dp[ind];
    //     int pick= nums[ind]+getAns(nums,ind+2,dp);
    //     int notpick= getAns(nums,ind+1,dp);;
    //     dp[ind]=  Math.max(pick,notpick);
    //     return dp[ind];
    // }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        int i;
        Arrays.fill(dp,0);
        dp[1]=nums[0];
        for(i=2;i<=nums.length;i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[i-1],dp[i-1]);
        }
        return dp[nums.length];
    }
}