class Solution 
{
    int getSum(int arr[],int div)
    {
        int sum=0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            sum+=Math.ceil((double)arr[i]/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] arr, int threshold) 
    {
        int low=1;
        int high=arr[0];
        for(int val : arr)
        {
            high=Math.max(high,val);
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int res=getSum(arr,mid);
            if(res<=threshold)
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