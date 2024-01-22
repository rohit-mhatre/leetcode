class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int streak = 0;
        for (int num :nums){
            if (num == 1) {
                counter++;
                streak = Math.max(streak,counter);                
            }
            else {
                counter = 0;
            }
        }
        return streak;
    }
}