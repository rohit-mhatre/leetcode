class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        int left = findLeftMost(nums, target);
        result[0] = left;
        if (left != -1) {
            result[1] = findRightMost(nums, target);
        }

        return result;
    }

    private int findLeftMost(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                end = mid - 1; 
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (start < nums.length && nums[start] == target) {
            return start;
        }

        return -1; 
    }

    private int findRightMost(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                start = mid + 1; 
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (end >= 0 && nums[end] == target) {
            return end;
        }

        return -1;
    }
}
