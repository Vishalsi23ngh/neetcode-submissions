class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();

        HashMap<String , List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] val = str.toCharArray();
            Arrays.sort(val);

            String key = new String(val);

            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(key, temp);
            }
        }

        for(String key : map.keySet()){
            ans.add(map.get(key));
        }


        return ans;
    }
}
