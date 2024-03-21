class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            String num = nums[i]+"";
            // System.out.println(num);
            int max=0;
            int j;
            for(j=0;j<num.length();j++)
            {
                max=Math.max(max,num.charAt(j)-'0');
            }
            String temp=max+"";
            String res=temp.repeat(j);
            // System.out.println(res);
            sum+=Integer.parseInt(res);
            
        }
        return sum;
    }
}