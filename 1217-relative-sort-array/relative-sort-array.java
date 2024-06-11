class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int res[] = new int[arr1.length];
        int i,j;
        int ind=0;
        for(i=0;i<arr2.length;i++)
        {
            for(j=0;j<arr1.length;j++)
            {
                if(arr1[j]==arr2[i])
                {
                    res[ind++]=arr1[j];
                    arr1[j]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        for(i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=-1)
            {
                res[ind++]=arr1[i];
            }
        }
        return res;
    }
}