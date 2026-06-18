class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        int left = 0; 
        int right = 0;
        int ans = 0;
        while(right < s.length()){
            char toAdd = s.charAt(right);
            

            if(set.contains(toAdd)){
                while( set.contains(toAdd)){
                    set.remove(s.charAt(left));
                    left++;
                }
            }else{
                set.add(toAdd);
                right++;
            }
            ans= Math.max(ans,set.size());
        }

        return ans;
    }
}
