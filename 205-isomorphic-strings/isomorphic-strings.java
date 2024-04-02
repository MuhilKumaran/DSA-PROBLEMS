class Solution {
    public boolean isIsomorphic(String s, String t) {
        int shash[]=new int[256];
        int thash[]=new int[256];
        int i;
        for(i=0;i<s.length();i++)
        {
            if(shash[s.charAt(i)]==0 && thash[t.charAt(i)]==0)
            {
                shash[s.charAt(i)]=t.charAt(i);
                thash[t.charAt(i)]=s.charAt(i);
            }
            else 
            {
                if(shash[s.charAt(i)]!=t.charAt(i) || thash[t.charAt(i)]!=s.charAt(i))
                {
                    return false;
                }
            }
        }
    
        return true;
    }
}