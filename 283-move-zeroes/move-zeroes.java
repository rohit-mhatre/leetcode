class Solution {
    public void moveZeroes(int[] nums) {
        int counter = 0;
        for (int x : nums) {
            if (x != 0) {
                nums[counter] = x;
                counter++;
            }
        }
        if (counter == 0) {
            return;
        }
        while (counter < nums.length) {
            nums[counter] = 0;
            counter++;
        }
    }
}
 