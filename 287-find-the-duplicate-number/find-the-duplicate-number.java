class Solution {
    static int partition(int a[],int low,int high)
    {
        int left=low;
        int pivot=a[low];
        int right=high;
        
        while(left<right)
        {
            while(a[left]<=pivot)
            left++;
            while(a[right]>pivot)
            right--;
            
            if(left<right)
            {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
            }
        }
       
        a[low]=a[right];
        a[right]=pivot;

        return right;
    }
    void quickSort(int a[] ,int l,int h)
    {
        int s =partition(a,l,h);
        quickSort(a,l,s-1);
        quickSort(a,s+1,h);
    }
    public int findDuplicate(int[] nums) {
        int res=0;
        // quickSort(nums,0,nums.length-1);
        Arrays.sort(nums);
        int i;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                res=nums[i];
            }
        }
        return res;
    }
}