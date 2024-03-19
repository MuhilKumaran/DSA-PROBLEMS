class Solution {
   
    public int bagOfTokensScore(int[] arr, int power) {
        int score=0;
        int max = 0;
        Arrays.sort(arr);
        int n=arr.length;
        if(n==0 || arr[0]>power)
            return 0;
        int l=0;
        int h=n-1;
        while(l<=h)
        { 
            if(arr[l]<=power)
            {
                power-=arr[l];
                score++;
                l++;
            }
            else 
            {
                power+=arr[h];
                score--;
                h--;
            }
           max=Math.max(max,score);
        }
        return max;
        
    }
}