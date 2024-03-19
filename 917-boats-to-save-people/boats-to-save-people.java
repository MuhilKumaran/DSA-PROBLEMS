class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat =0;
        int n=people.length;
        int l=0;;
        int r=n-1;
        while(l<=r)
        {
            if(people[l]+people[r]<=limit)
            {
                boat++;
                l++;
                r--;
            }
            else
            {
                boat++;
                r--;
            }
        }
        return boat;
    }
}