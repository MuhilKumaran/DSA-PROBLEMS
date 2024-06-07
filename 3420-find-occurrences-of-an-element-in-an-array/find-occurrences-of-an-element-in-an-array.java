class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n = nums.length;
        int res[] = new int[queries.length];
        Arrays.fill(res,-1);
        int c=0;
        Map<Integer,Integer> map = new HashMap<>();
        int i;
        for(i=0;i<n;i++)
        {
            if(nums[i]==x)
            {
                c++;
                map.put(c,i);
            }
        }
        System.out.println(map);
        int ind=0;
        for(i=0;i<queries.length;i++)
        {
            if(map.containsKey(queries[i]))
            {
                res[ind]=map.get(queries[i]);
            }
            ind++;
        }
        return res;
    }
}