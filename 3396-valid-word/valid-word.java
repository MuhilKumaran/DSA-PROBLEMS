class Solution {
    public boolean isValid(String word) {
        boolean res=false;
        if(word.length()>=3)
        {
            int i;
            int vow=0;
            int cons=0;
            for(i=0;i<word.length();i++)
            {
                char ch = Character.toLowerCase(word.charAt(i));
                if(!Character.isAlphabetic(ch) && !Character.isDigit(ch))
                {
                    
                    return false;
                }
                else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    vow=1;
                }
                else if(!Character.isDigit(ch))
                {
                    cons=1;
                }
            }
            return vow==1 && cons==1;
        }
        return false;
    }
}