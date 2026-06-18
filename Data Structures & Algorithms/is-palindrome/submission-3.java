class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0; 
        int right = s.length() - 1;

        while(left  < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);

            if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
