class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxVal = 0;
        while(left<right){
            if(height[left] < height[right]){
              maxVal = Math.max(maxVal, height[left] * (right - left));
              left++;
            }else{
                maxVal = Math.max(maxVal, height[right] *(right-left));
                right--;
            }
        }
        return maxVal;
    }
}