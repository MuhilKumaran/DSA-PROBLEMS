class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double res= Float.MAX_VALUE;
        int l=0;
        int r=n-1;
        while(l<r)
        {
            double avg = (nums[l]+nums[r])/2.0;
            res=Math.min(res,avg);
            l++;
            r--;
        }
        return res;
    }
}