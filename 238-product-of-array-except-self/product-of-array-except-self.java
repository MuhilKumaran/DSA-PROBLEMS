class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ind=0;
        int c=0;
        int i;
        int pro=1;
        int res[] = new int[nums.length];
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c++;
                ind=i;
            }
            else
            {
                pro*=nums[i];
            }
        }
        if(c==1)
        {
            res[ind]=pro;
            return res;
        }
        else if(c>=2)
            return res;
        else
        {
            for(i=0;i<nums.length;i++)
            {
                res[i]=pro/nums[i];
            }
        }
        return res;
    }
}