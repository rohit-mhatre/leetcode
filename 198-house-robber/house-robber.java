class Solution {
    public int rob(int[] nums) {
        int ifRob = 0;
        int ifNotRob = 0;
        for (int i =0; i < nums.length; i++) {
            int temp = ifNotRob + nums[i];
            ifNotRob = Math.max(ifNotRob, ifRob);
            ifRob = temp;
        }
        return Math.max (ifRob, ifNotRob);
    }
}