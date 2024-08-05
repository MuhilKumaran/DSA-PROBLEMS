class Solution {
    public boolean canAliceWin(int[] nums) {
        int SD = 0;
        int DD=0;
        for(int val:nums)
        {
            if(val<10)
            {
                SD+=val;
            }
            else
            {
                DD+=val;
            }
        }
        return SD!=DD;
    }
}