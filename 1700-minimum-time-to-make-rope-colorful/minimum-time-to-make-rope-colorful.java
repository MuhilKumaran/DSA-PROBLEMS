class Solution {
    public int minCost(String colors, int[] time) {
         int prev=0;
         int res=0;
         int i;
         for(i=1;i<colors.length();i++)
         {
            if(colors.charAt(prev)==colors.charAt(i))
            {
                res+=Math.min(time[prev],time[i]);
                if(time[prev]<time[i])
                    prev=i;
            }
            else
            {
                prev=i;
            }
         }
         return res;
    }
}
