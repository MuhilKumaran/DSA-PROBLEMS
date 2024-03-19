class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i;
        int tot=0;
        for(i=0;i<gas.length;i++)
        {
            tot+=gas[i]-cost[i];
        }
        if(tot<0)
            return -1;
        int start=0;
        int rem=0;
        for(i=0;i<cost.length;i++)
        {
           int curGas=gas[i]+rem;
           int curCos=cost[i];
           rem=curGas-curCos;
           if(rem<0)
           {
            rem=0;
            start=i+1;
           }
        }
        return start;
        
    }
}