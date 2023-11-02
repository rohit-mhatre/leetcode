class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] result = new int[nums.length];
        if (nums.length != 1){
            leftsum[0] = 0;
            rightsum[nums.length - 1] = 0;

            for (int i = 1; i < nums.length; i++){
                leftsum[i] = nums[i-1] + leftsum[i-1];
            }
            for (int i = nums.length - 2; i >= 0; i--){
                rightsum[i] = nums[i+1] + rightsum[i+1];
            }
            for (int i = 0; i < nums.length; i++){
                result[i] = Math.abs(leftsum[i] - rightsum[i]);
            }
    }
    else{
        result[0] = 0;
    }
    return result;
}
}