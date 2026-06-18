class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int key : nums){
            set.add(key);
        }
        int ans = 0;
        for(int key : nums){
            int ct = 1;
            while(set.contains(key -1)){
                ct++;
                key = key - 1;
            }
            ans = Math.max(ct, ans);
        }

        return ans;
    }
}
