class Solution {
    public int pivotInteger(int n) {
        int i,j;
        for(i=1;i<1000;i++)
        {
            int num=i*(i+1)/2;
            int sum=0;
            for(j=i;j<=n;j++)
            {
                sum+=j;
            }
            if(num==sum)
                return i;
        }
        return -1;
    }
}