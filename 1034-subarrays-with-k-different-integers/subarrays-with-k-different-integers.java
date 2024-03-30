class Solution {
    static int subarray(int nums[],int k)
    {
        int count=0;
        int l=0;
        int r=0;
        Map<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        while(r<n)
        {
           map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            
            while(map.size()>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                    map.remove(nums[l]);
                l++;
                
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarray(nums,k)-subarray(nums,k-1);
    }
}