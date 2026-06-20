class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<>();

        for(int key : nums){
            set.add(key);
        }
        int res = 1;
        for(int key : nums){
            int ans = 1;
            while(set.contains(key -1)){
                ans++;
                key--;
            }
            res = Math.max(res, ans);
        }

        return res;
    }
}
