class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[nums.length + 1];

        for (int i : nums) {
            arr[i]++;
        }
        int a = 0; 
        int b = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2) {
                a = i;
            }
            if (arr[i] == 0) {
                b = i;
            }
        }
        return new int[] {a,b};
    }
}