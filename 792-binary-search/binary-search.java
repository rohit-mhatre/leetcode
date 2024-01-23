class Solution {
    public int search(int[] nums, int target) {
        return Binary(nums, target, 0, nums.length - 1);
    }
    public int Binary (int arr[], int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(target < arr[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}