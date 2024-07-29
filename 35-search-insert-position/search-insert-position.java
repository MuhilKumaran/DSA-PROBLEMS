class Solution {
    public int searchInsert(int[] nums, int target) {
         int n = nums.length;
         if(nums[n-1]<target)
            return n;
         int l=0;
         int h=n-1;
         while(l<h)
         {
            int mid=l+(h-l)/2;
            if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                h=mid;
            }
         }
         return l;
    }
}