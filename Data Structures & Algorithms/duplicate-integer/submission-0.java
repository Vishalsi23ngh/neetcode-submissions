class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int key : nums){
            if(set.contains(key)){
                return true;
            }
            set.add(key);
        }
        return false;
    }
}