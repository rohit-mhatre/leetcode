// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] s_char = s.toCharArray();
//         char[] t_char = t.toCharArray();

//         Arrays.sort(s_char);
//         Arrays.sort(t_char);

//         return Arrays.equals(s_char, t_char);
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }
        for (int a : count) {
            if (a != 0) {
                return false;
            }
        }
        return true;
    }
}