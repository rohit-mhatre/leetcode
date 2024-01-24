class Solution {
    public boolean search(int[] nums, int target) {
        return binary(nums, target) != -1;
    }

    private int binary(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return 1;
            }
            if (arr[low] < arr[mid]) {
                if (target < arr[low] || target > arr[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            else if (arr[low] > arr[mid]) {
                if(target < arr[mid] || target > arr[high]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                low ++;
            }
        }
        return -1;
    }
}