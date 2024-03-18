class Solution {
    public String frequencySort(String s) {
        String res="";
        Map<Character,Integer> map = new TreeMap<>();
        int i,j;
        for(i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        System.out.println(list);
        StringBuffer sb = new StringBuffer();
        for(char c : list)
        {
            int count=map.get(c);
            for(j=0;j<count;j++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}