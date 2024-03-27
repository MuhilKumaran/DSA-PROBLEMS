class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0 || k==1)
            return 0;
        int product=1;
        int n = nums.length;
        int left=0;
        int right=0;
        int count=0;
        while(right<n)
        {
            product*=nums[right];
            while(left<right && product>=k)
            {
                product/=nums[left];
                left++;
            }
            if(product<k)
            {
                count+=(right-left+1);
            }
            right++;
        }
        return count;
    }
}