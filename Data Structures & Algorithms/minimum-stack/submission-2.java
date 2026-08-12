class MinStack {
    long minValue = Integer.MAX_VALUE;
    Stack<Long> stack ;

    public MinStack() {
       stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            stack.push((long)val);
            minValue = val;
        }else{
            if(val >= minValue ){
                stack.push((long)val);
            }else{
                stack.push(2 * (long)val - minValue);
                minValue  = val;
            }
        }
    }

    public void pop() {
       if(stack.isEmpty())
        return;
        if(stack.peek() >= minValue)
            stack.pop();
        else{
           minValue = 2 * minValue - stack.peek();
           stack.pop();

        }
    }

    public long top() {
        if(stack.peek() < minValue)
            return (int)minValue;
        return stack.peek();
    }


    public int getMin() {
         return (int)minValue;
    }
}