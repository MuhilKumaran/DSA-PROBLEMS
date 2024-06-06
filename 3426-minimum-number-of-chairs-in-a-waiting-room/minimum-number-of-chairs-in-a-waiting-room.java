class Solution {
    public int minimumChairs(String s) {
        int max=-1;
        int i;
        int count=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='E')
            {
                count++;
                max=Math.max(max,count);
            }
            else
            {
                count--;
            }
        }
        return max;
    }
}