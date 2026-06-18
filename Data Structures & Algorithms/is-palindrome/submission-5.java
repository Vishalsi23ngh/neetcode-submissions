class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while(l <= r){
            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));
            

            if(Character.isLetterOrDigit(left) && Character.isLetterOrDigit(right)){
                if(left == right){
                    l++;
                    r--;
                }else{
                    return false;
                }
            }else if(!Character.isLetterOrDigit(left)){
                l++;
            }else if(!Character.isLetterOrDigit(left) && !Character.isLetterOrDigit(right)){
                r--;
                l++;
            }else{
                r--;
            }
        }    
        return true;
    }
}
