class Solution {
    public int majorityElement(int[] nums) {
        
        int val = nums[0];
        int ct = 0;
        for(int key : nums){
            if(ct >= 0 && key != val){
                ct--;
            }else if( ct == -1){
                val = key;
                ct++;
            }else{
                ct++;
            }
        }
        return val;
    }
}