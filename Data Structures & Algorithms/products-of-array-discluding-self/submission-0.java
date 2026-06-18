class Solution {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        int prod = 1;

        for(int key : nums){
            if(key == 0){
                countZero++;
            }else{
                prod = prod * key ;
            }
        }

        if(countZero >= 2){
            for(int i = 0; i < nums.length ;i++){
                nums[i] = 0;
            }
        }else if(countZero == 1){
                for(int i = 0; i < nums.length ;i++){
                    if(nums[i] == 0){
                        nums[i] = prod;
                    }else{
                        nums[i] = 0;
                    }
                }
        }else{
            for(int i = 0; i < nums.length ;i++){
               nums[i] = prod / nums[i];
            }
        }

        return nums;
    }
}  
