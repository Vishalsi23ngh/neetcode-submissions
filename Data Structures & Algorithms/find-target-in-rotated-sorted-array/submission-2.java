class Solution {
    public int search(int[] nums, int target) {

        int left = 0; 
        int right = nums.length - 1;

        while(left <= right){
            int mid = left  + (right - left) / 2;

            if(nums[mid] == target) return mid;

            //check the first half is sorted
            if(nums[left] <= nums[mid]){
                //check if the element lie between the first half , than shrink the right pointer
                if(target >= nums[left]  && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{//checking if the second half is sorted
            //check if the element lie between the first half 
                if(target  > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1; //in case of no target is found
        
    }
}
