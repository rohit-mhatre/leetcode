class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        if (len == 2) {
            return "";
        }
        char[] c = s.toCharArray();
        StringBuilder str = new StringBuilder();
        int open = 1;
        int openLeft = 0;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open += 1;
                if (open > 1) {
                    str.append('(');
                }
            }
            else {
                if (open > 1) {
                    str.append(')');
                }
                open -= 1;
            }
        }
        return str.toString();
    }
}