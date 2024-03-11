class Solution {
    public String convert(String s, int numRows) {
        int  row=1;
        boolean  flag=true;
        Map<Integer,String> map  =new  LinkedHashMap<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            String str=map.getOrDefault(row,"");
            map.put(row,str+s.charAt(i));
            if(flag)
            {
                row++;
                if(row==numRows)
                    flag=false;
            }
            else
            {
                row--;
                if(row==1)
                    flag=true;
            }
        }
        String  res="";
        for(String val:map.values())
        {
            res+=val;
        }
        return res;
    }
}