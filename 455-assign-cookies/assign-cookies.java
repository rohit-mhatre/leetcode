class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cookie = s.length;
        if (cookie == 0){
            return 0;
        }
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex = cookie - 1;
        int childIndex = g.length - 1;

        while (cookieIndex >= 0 && childIndex >= 0) {
            if (s[cookieIndex] >= g[childIndex]) {
            count++;
            cookieIndex--;
        }
        childIndex--;
        }
    return count; 
    }
}