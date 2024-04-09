class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        String temp=goal+goal;
        return temp.contains(s);
    }
}