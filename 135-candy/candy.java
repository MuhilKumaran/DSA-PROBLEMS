class Solution {
    public int candy(int[] rate) {
        int res[]= new int[rate.length];
        int n=rate.length;
        int i;
        for(i=0;i<n;i++)
        {
            res[i]=1;
        }
        int count=0;
        for(i=0;i<rate.length-1;i++)
        {
            if(rate[i+1]>rate[i])
            {
                res[i+1]=1+res[i];
            }
        }
        for(i=n-1;i>0;i--)
        {
            if(rate[i-1]>rate[i])
            {
                res[i-1]=Math.max(res[i-1],1+res[i]);
                
            }
        }
        for(int val:res)
            count+=val;
        return count;
    }
}