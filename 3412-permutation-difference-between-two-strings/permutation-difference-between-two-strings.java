class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        int i;
        for(i=0;i<s.length();i++)
        {
            int ind=t.indexOf(s.charAt(i));
            sum+=Math.abs(i-ind);
        }
        return sum;
    }
}