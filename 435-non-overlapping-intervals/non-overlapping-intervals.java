class Solution {
    public int eraseOverlapIntervals(int[][] inter) {
         Arrays.sort(inter,(a,b)->a[1]-b[1]);
         int i;
         int count=0;
        int prev=inter[0][1];
        for(i=0;i<inter.length;i++)
            System.out.println(inter[i][0]+"  "+inter[i][1]);
         for(i=1;i<inter.length;i++)
         {
            if(inter[i][0]<prev)
            {
                count++;
            }
            else
            {
                prev=inter[i][1];
            }
         }
         return count;
    }
}