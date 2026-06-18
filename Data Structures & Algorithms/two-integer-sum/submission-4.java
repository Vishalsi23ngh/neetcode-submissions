class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            int key = nums[i];
            int val = target - key;
            if(map.containsKey(val)){
                return new int[]{map.get(val) , i};
            }
            map.put(key , i);
        }

       

        return new int[]{-1,-1};
    }
}
