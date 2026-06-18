class Solution {
    public boolean isAnagram(String s, String t) {

        int arr[] = new int[26];
        
        for(char ch : s.toCharArray()){
            int i = ch - 'a';
            arr[i]++;
        }

        for(char ch : t.toCharArray()){
            int i = ch - 'a';
            arr[i]--;
        }


        for(int key : arr){
            if(key > 0 || key  < 0){
                return false;
            }
        }

        return true;
    }
}
