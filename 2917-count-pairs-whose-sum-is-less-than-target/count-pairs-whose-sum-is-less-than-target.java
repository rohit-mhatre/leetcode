class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        int counter = 0;
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                counter = counter + right - left;
                left += 1;
            }
            else {
                right -= 1;
            }
        }
        return counter;
    }
}