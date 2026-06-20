class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int n  = nums.length;
        if(n < 3){
            return result;
        }
        
        Arrays.sort(nums);

        for(int i = 0 ; i < n - 2; i++){
           if(i > 0 && nums[i] == nums[i -1]) continue; 

            int left = i + 1;
            int right = n - 1;
            int target = 0 - nums[i];
            while(left < right){
                int sum = nums[left] + nums[right];

                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(right > left && nums[right] == nums[right -1]) right--;

                    left++;
                    right--;
                    
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }

            }

        }
        return result;
    }
}
