class Solution {
    public boolean isArraySpecial(int[] nums) {
        int i;
        for(i=0;i<nums.length-1;i++)
        {
            int num1=nums[i];
            int num2=nums[i+1];
            if((num1%2==0 && num2%2==0) || (num1%2!=0 && num2%2!=0))
                return false;
        }
        return true;
    }
}