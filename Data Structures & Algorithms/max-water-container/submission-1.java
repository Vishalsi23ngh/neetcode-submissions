class Solution {
    public int maxArea(int[] nums) {
        
        int area = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){ 
            area = Math.max(area, (right - left) * Math.min(nums[left] , nums[right]));
            
            if(nums[right] > nums[left] ) left++;
            else right --;
            
        }

        return area;
    }
}
