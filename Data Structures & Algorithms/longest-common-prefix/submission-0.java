class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ans = strs[0];

        for(String key : strs){
            ans = common(key, ans);
        }
        return ans;
    }

    public String common(String word, String key){
        String ans = "";
        int n = Math.min(word.length(), key.length());
        for(int i = 0; i < n; i++){
            if(word.charAt(i) == key.charAt(i)){
                ans += word.charAt(i);
            }else{break;}
        }
        return ans;
    }
}