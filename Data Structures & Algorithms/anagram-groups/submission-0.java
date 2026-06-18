class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        for(String key : strs){
           char[] chars = key.toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);
            if(map.containsKey(word)){
                map.get(word).add(key);
            }else{
                List<String> lis = new ArrayList<>();
                lis.add(key);
                map.put(word, lis);
            }
        }
        List<List<String>> ans = new ArrayList<>(map.values());

        
        return ans;
    }
}
