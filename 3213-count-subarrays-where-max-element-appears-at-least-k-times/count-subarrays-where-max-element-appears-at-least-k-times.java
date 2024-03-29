class Solution {
    public long countSubarrays(int[] nums, int q) {
        long res=0;
        int i=0,j=0;
        int n = nums.length;
        // Map<Integer,Integer> map = new HashMap<>();
        int max=0;
        int c=0;
        for(int k=0;k<nums.length;k++)
        {
            max=Math.max(max,nums[k]);
        }
        for(j=0;j<nums.length;j++)
        {
            if(nums[j]==max)
            {
                c++;
            }
            while(c>=q)
            {
                res+=(n-j);
                if(nums[i]==max)
                    c--;
                i++;
            }
        }
        return res;
    }
}