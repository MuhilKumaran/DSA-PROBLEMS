class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        // int sum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     String num = nums[i]+"";
        //     // System.out.println(num);
        //     int max=0;
        //     int j;
        //     for(j=0;j<num.length();j++)
        //     {
        //         max=Math.max(max,num.charAt(j)-'0');
        //     }
        //     String temp=max+"";
        //     String res=temp.repeat(j);
        //     // System.out.println(res);
        //     sum+=Integer.parseInt(res);
            
        // }
        // return sum;
        int sum = 0;
        for (int num : nums) {
            if (num <= 99) {
                if (num <= 9) {
                    sum += num;
                } else {
                    sum += 11 * Math.max(num % 10, num / 10);
                }
            } else if (num <= 999) {
                sum += 111 * Math.max(num % 10, Math.max((num / 10) % 10, num / 100));
            } else {
                sum += 1111;
            }
        }
        return sum;
    }
}