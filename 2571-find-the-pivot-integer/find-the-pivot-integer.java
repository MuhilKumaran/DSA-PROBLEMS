class Solution {
    public int pivotInteger(int n) {
       int num=n*(n+1)/2;
       int rt = (int)Math.sqrt(num);
       if(rt*rt==num)
            return rt;
        
        return -1;
    }
}