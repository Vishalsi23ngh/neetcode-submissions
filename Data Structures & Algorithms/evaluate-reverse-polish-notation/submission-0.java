class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();

        for(String key : tokens){
            if(Character.isDigit(key.charAt(key.length()-1))){
                 int val = Integer.parseInt(key);
                 st.push(val);
            }else{
                int num1 = st.pop();
                int num2 = st.pop();
                int res = 0;
                
                if(key.equals("*")){
                    res = num2 * num1;
                } else if(key.equals("-")){
                    res = num2 - num1;
                } else if(key.equals("+")){
                    res = num2 + num1;
                } else {
                    res = num2 / num1;
                }

                st.push(res);
            }
           
        }

        return st.pop();
    }
}
