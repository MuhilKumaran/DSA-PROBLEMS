class Solution {
    public long countAlternatingSubarrays(int[] nums) {
       
        long count=0;
        int l=0;
        int r=0;
        int n=nums.length;
        while(r<n)
        {
            
            while(l<r && nums[r]==nums[r-1])
            {
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}