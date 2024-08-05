class Solution {
    int getPossible(int arr[],int mid)
    {
        int count=1;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]<=mid)
            {
                sum+=arr[i];
            }
            else
            {
                count++;
                sum=arr[i];
            }
        }
        return count;
    }
    public int splitArray(int[] arr, int k) {
        int low=arr[0];
        int high=0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int res=getPossible(arr,mid);
            if(res>k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return low;

    }
}