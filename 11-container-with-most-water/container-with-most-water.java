class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0, max_area = 0;
        while (left < right){
            area = (right - left) * Math.min (height[left], height[right]);
            max_area = Math.max(area, max_area);
            if (height[left] < height[right]){
                left += 1;
            }
            else{
                right -= 1;
            }
        }
        return max_area;
    }
}