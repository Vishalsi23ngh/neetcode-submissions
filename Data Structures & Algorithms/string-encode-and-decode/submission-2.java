class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String key : strs){
            sb.append(key.length()).append('#').append(key);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {    

        int i = 0;
        List<String> result = new ArrayList<>();
        while(i  < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j)); 

            result.add(str.substring(j + 1 , j + len + 1));

            i = j + len + 1;
        }

        return result;

    }
}
