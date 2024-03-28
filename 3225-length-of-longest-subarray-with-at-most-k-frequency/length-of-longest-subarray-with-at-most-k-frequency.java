class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        Map<Integer,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int n=nums.length;
        while(r<n)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            // int freq=map.getOrDefault(nums[r],0);
            
                while(map.get(nums[r])>k)
                {
                    map.put(nums[l],map.get(nums[l])-1);
                    if(map.get(nums[l])==0)
                        map.remove(nums[l]);
                    l++;
                }
        
            
            
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}