class Solution {
    public int numberOfBeams(String[] bank) {
        int prevRow = 0;
        int total = 0;

        for (String rows : bank) {
            int currRow = cal(rows);
            if (currRow == 0) {
                continue;
            }
            total = total + currRow * prevRow;
            prevRow = currRow;
        }
        return total;
    }

    private int cal (String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count = count + c - '0';
        }
        return count;
    }
}