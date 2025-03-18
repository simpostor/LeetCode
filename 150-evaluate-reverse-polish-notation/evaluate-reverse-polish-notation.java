class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("/") ||token.equals("*") ||token.equals("-") ){//its operand
                int b = stack.pop();
                int a = stack.pop();
                if(token.equals("+"))
                    stack.push(a+b);
                else if(token.equals("-"))
                    stack.push(a-b);
                else if(token.equals("*"))
                    stack.push(a*b);
                else
                    stack.push(a/b);

            }
            else{//its num
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        return stack.peek();
    }
}