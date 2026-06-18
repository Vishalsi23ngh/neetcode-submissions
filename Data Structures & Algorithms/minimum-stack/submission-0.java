class MinStack {

    Stack<Integer> st;

    public MinStack() {
         st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
           return st.peek();
        }
        return -1;
    }
    
    public int getMin() {

        Stack<Integer> minSt = new Stack<>();
        int min = Integer.MAX_VALUE;
        while(!st.isEmpty()){
            min = Math.min(st.peek(), min);
            int val = st.pop();
            minSt.push(val);
        }

        while(!minSt.isEmpty()){
            st.push(minSt.pop());
        }
        
        return min;
    }
}
