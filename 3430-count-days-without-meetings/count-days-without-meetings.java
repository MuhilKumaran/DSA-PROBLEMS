class Solution 
{
    public int countDays(int days, int[][] meet) 
    {
        Arrays.sort(meet,(a,b)->a[0]-b[0]);
        int i;
        int res=Math.abs(meet[0][0]-1);
        for(i=1;i<meet.length;i++)
        {
            System.out.println(meet[i][0]+" - "+meet[i][1]);
            if(meet[i][0]<=meet[i-1][1])
            {
                if(meet[i][1] < meet[i-1][1])
                {
                    meet[i][1]=meet[i-1][1];
                }
            }
            else
            {
                int t = meet[i][0]-meet[i-1][1]-1;
                res+=t;
            }
        }
        res+=Math.abs(meet[meet.length-1][1]-days);
        return res;
    }
}