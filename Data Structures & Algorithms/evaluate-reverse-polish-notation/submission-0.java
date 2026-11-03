class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String s : tokens){
            int res = 0;
            int val1 = 0;
            switch(s){
                case "+":
                    res = stack.pop();
                    res+= stack.pop();
                    stack.push(res);
                    break;
                case "-":
                    val1 = stack.pop();
                    res= stack.pop() - val1;
                    stack.push(res);
                    break;
                case "*":
                    res = stack.pop();
                    res*= stack.pop();
                    stack.push(res);
                    break;
                case "/":
                    val1 = stack.pop();
                    res= stack.pop() / val1;
                    stack.push(res);
                    break;
                default :
                    stack.push(Integer.valueOf(s));
            }
        }
        return stack.peek();
    }
}
