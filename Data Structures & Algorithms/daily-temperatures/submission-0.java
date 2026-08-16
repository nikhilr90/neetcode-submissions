class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int size = temperatures.length;
        int[] result = new int[size];

        for(int idx = 0 ; idx < size ; idx++){
            while(!stack.isEmpty() && temperatures[idx] > temperatures[stack.peek()]){
                int pop = stack.pop();
                result[pop] = idx - pop ;
            }
            stack.push(idx);
        }
        return result;

    }
}
