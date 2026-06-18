class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int ans = 0;

        int left = 0;
        int right = 0;

        
        while(right < s.length()){
            char ch_add = s.charAt(right);

            while(set.contains(ch_add)){
                set.remove(s.charAt(left));
                left++;
            } 

            set.add(ch_add);
            right++;

            ans = Math.max(ans, (right - left));
        }

        return ans;
    }
}
