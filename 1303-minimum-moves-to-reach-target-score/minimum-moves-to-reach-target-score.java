class Solution {
    public int minMoves(int target, int max) {
        int count=0;
        if(max==0)
            return target-1;
        while(target>1 && max>0)
        {
            if(target%2!=0)
            {
                target-=1;
            }
            else
            {
                target/=2;
                max-=1;
            }
            count++;
        }
        
        return count+target-1;
    }
}