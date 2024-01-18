class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;  
        reverseArray(nums, 0, size - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, size - 1);
    }

    private void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
