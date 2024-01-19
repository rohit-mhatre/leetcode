class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        if (a == 1 || b == 1) {
            return matrix[0][0];
        }
        int[][] dp = new int[a][b];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for (int i =0; i < matrix.length; i++) {
            ans = Math.min (ans, minFallingPathSum(matrix, 0 ,i, dp));
        }
        return ans;
    }
    private int minFallingPathSum(int[][] matrix, int row, int col, int[][]dp) {
        int a = matrix.length;
        int b = matrix[0].length;
        if (dp[row][col] != Integer.MAX_VALUE) {
            return dp[row][col];
        }
        if (row == a-1) {
            return dp[row][col] = matrix[row][col];
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if(col > 0) {
            left = minFallingPathSum (matrix, row + 1, col-1, dp);
        }
        int straigh = minFallingPathSum (matrix, row +1, col, dp);
        if (col < b -1) {
            right = minFallingPathSum (matrix, row + 1, col + 1, dp);
        }
        dp[row][col] = Math.min(left, Math.min(straigh, right)) + matrix[row][col];

        return dp[row][col];
    }
}