class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++)
        {
            if(!tokens[i].equals("+") && !tokens[i].equals("-") &&
               !tokens[i].equals("*") && !tokens[i].equals("/"))
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
            else
            {
                int t1 = stack.pop();
                int t2 = stack.pop();
                int total = 0;

                if(tokens[i].equals("+"))
                    total = t2 + t1;

                if(tokens[i].equals("-"))
                    total = t2 - t1;

                if(tokens[i].equals("*"))
                    total = t2 * t1;

                if(tokens[i].equals("/"))
                    total = t2 / t1;

                stack.push(total);
            }
        }

        return stack.peek();
    }
}