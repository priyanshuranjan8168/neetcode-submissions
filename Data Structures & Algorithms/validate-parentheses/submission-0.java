class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<>();
       for(Character ch:s.toCharArray()){
           if(ch=='['|| ch=='{' || ch=='('){
             stack.push(ch);
             continue;
           }
           if(stack.isEmpty()) return false;
           if(ch==')' && stack.peek()=='(') stack.pop();
           else if(ch=='}' && stack.peek()=='{') stack.pop();
            else if(ch==']' && stack.peek()=='[') stack.pop();
            else return false;
            
    }
    if(!stack.isEmpty()) return false;
    return true;
    }
}