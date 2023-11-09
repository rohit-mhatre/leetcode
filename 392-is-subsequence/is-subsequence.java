class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        int last = 0;
        while (start < s.length() && last < t.length()){
            if (s.charAt(start) == t.charAt(last)){
                start += 1;
            }
            last += 1;
        }
        return start == s.length();
    }
}