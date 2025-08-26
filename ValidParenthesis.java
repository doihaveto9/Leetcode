class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> close = new ArrayList<>(Arrays.asList(')', ']', '}'));
        ArrayList<Character> open = new ArrayList<>(Arrays.asList('(', '[', '{'));

        for(char c : s.toCharArray()){
            if(open.contains(c)){
                stack.push(c);
            }
            else if(close.contains(c)){
                if(stack.empty()){
                    return false;
                }
                
                char top = stack.peek();

                if(top == '('){
                    if(c == ')'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(top == '['){
                    if(c == ']'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(top == '{'){
                    if(c == '}'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }

        return stack.empty();
    }
}