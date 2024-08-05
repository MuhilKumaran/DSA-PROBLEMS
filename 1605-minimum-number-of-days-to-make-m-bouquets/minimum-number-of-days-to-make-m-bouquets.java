class Solution {
    boolean isPossible(int arr[],int day,int m,int k)
    {
        int tot=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                count++;
            }
            else
            {
                tot+=(count/k);
                count=0;
            }
        }
        tot+=(count/k);
        return tot>=m;
    }
    public int minDays(int[] arr, int m, int k) {
        int n=arr.length;
        long tot = (long)m*k;
        if(n<tot)
            return -1;
        int low=arr[0];
        int high=arr[0];
        int i;
        for(i=0;i<n;i++)
        {
            low=Math.min(low,arr[i]);
            high=Math.max(high,arr[i]);
        }

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isPossible(arr,mid,m,k))
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}