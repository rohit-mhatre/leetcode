class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length > 1){
            int temp = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i] != 0){
                    nums[temp] = nums[i];
                    temp++;
                }
            }
            while(temp < nums.length) {
                nums[temp] = 0;
                temp++;
            }
        }
        else{
            return;
        }
    }
}