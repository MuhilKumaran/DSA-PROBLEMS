class Solution {
    public int leastInterval(char[] tasks, int n) {
        int fre[] = new int[26];
        int i;
        for(char ch : tasks)
            fre[ch-'A']++;
        Arrays.sort(fre);
        int max = fre[25];
        int chunks=max-1;
        int idle = n*chunks;
        for(i=24;i>=0;i--)
        {
            idle-=Math.min(chunks,fre[i]);
        }
        return idle<0 ? tasks.length : idle+tasks.length;
    }
}