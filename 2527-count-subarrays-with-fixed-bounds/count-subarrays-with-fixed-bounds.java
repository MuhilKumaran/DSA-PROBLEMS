class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res=0;
        boolean min=false;
        boolean max=false;
        int i;
        int start=0;
        int minstart=0;
        int maxstart=0;
        for(i=0;i<nums.length;i++)
        {
            int n = nums[i];
            if(n<minK || n>maxK)
            {
                min=false;
                max=false;
                start=i+1;
            }
            if(n==minK)
            {
                min=true;
                minstart=i;
            }
            if(n==maxK)
            {
                max=true;
                maxstart=i;
            }
            if(min && max)
            {
                res+=(Math.min(minstart,maxstart)-start+1);
            }
        }
        return res;
    }
}