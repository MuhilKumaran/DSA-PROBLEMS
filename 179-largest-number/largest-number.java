class Solution {
    class Sortit implements Comparator<String>{
        public int compare(String a,String b)
        {
            String a1 = a+b;
            String a2 = b+a;
            return a2.compareTo(a1);
        }
    }
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        int i;
        for(i=0;i<nums.length;i++)
        {
            arr[i]=nums[i]+"";
        }
        Arrays.sort(arr,new Sortit());
        if(arr[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for(String val:arr)
            sb.append(val);
        return sb.toString();
    }
}