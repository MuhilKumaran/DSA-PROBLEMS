class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        int i;
        for(i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int temp = sum-goal;
            if(map.containsKey(temp))
                count+=map.get(temp);
           
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}