class MinStack {

    private Stack<int[]> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int newMin = st.isEmpty() ? val : Math.min(val, st.peek()[1]);
        st.push(new int[]{val, newMin});
    }
    
    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int peek() {
        return st.isEmpty() ? -1 : st.peek()[0];
    }
    
    public int top() {
        return st.isEmpty() ? -1 : st.peek()[0];
    }
    
    public int getMin() {
         return st.isEmpty() ? -1 : st.peek()[1];
    }
}
