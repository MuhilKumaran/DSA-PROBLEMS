class Solution {
    public int[][] insert(int[][] intervals, int[] newInter) {
        int n=intervals.length;
        int arr[][] = new int[n+1][2];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<2;j++)
            {
                arr[i][j]=intervals[i][j];
            }
        }
        arr[n][0]=newInter[0];
        arr[n][1]=newInter[1];
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<int[]> li=new ArrayList<int[]>();
        li.add(arr[0]);
        
        for(i=1;i<arr.length;i++)
        {
            int curr[]=arr[i];
            int  lsize=li.size();
            int last[]=li.get(lsize-1);
            if(last[1]>=curr[0])
            {
                li.remove(lsize-1);
                li.add(new int[]{last[0],Math.max(last[1],curr[1])});
            }
            else
            {
                li.add(curr);
            }

        }
        return li.toArray(new int[li.size()][2]);
    }
}