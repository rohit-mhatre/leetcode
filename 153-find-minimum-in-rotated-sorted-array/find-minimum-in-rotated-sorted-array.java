class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0){     //corner case
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while(left < right){   //leave the while loop when we have only one element
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;   //skip the nums[mid] since it is not the candidate
            }else{
                right = mid ;   
            }
        }
        return nums[left];   //return the only element left
    }
}