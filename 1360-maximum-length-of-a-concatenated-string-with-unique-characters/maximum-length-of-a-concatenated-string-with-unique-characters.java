import java.util.HashSet;
import java.util.List;

class Solution {
    public int maxLength(List<String> arr) {
        List<String> ls = new ArrayList<>();
        for (String s : arr) {
            int flag = 0;
            HashSet<Character> visited = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                if (visited.contains(s.charAt(j))) {
                    flag = 1;
                    break;
                } else {
                    visited.add(s.charAt(j));
                }
            }
            if (flag == 0) {
                ls.add(s);
            }
        }

        return helper("", 0, ls);
    }

    private int helper(String s, int i, List<String> ls) {
        if (i == ls.size()) {
            return s.length();
        }

        int notTake = helper(s, i + 1, ls);
        int flag = 0;
        for (int j = 0; j < s.length(); j++) {
            if (ls.get(i).contains(String.valueOf(s.charAt(j)))) {
                flag = 1;
                break;
            }
        }
        int take = 0;
        if (flag == 0) {
            take = helper(s + ls.get(i), i + 1, ls);
        }

        return Math.max(take, notTake);
    }
}