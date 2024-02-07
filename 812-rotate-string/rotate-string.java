class Solution {
    public boolean rotateString(String s, String goal) {
        if (s == null || goal == null) {
            return false;
        }
        if (s. length() != goal.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if(rotateString(s,goal,i)) {
                return true;
            }
        }
        return false;
    }
    private boolean rotateString(String r, String o, int temp) {
        for (int i = 0; i < r.length(); i++) {
            if(r.charAt(i) != o.charAt((i + temp) % o.length())) {
                return false;
            }
        }
        return true;
    }
}