class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> set = new HashSet<>();
        int i;
        int maxlen=1;
        for(i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        
        for(int val : set)
        {
            int count=1;
            if(!set.contains(val-1))
            {
                int x=val+1;
                while(set.contains(x))
                {
                    count++;
                    x++;
                }
                maxlen=Math.max(maxlen,count);
            }
        }
        return maxlen;
    }
}