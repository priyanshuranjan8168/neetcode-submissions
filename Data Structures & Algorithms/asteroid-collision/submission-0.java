class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int a:asteroids){
            boolean flag=true;
            while(flag && a<0 && !stack.isEmpty() && stack.peek()>0){
                    if(stack.peek()<-a) stack.pop();
                    else if(stack.peek()==-a) {
                        stack.pop();
                        flag=false;
                    }
                    else flag=false;
            }
            if(flag) stack.push(a);
        }
        int[] ans=new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            ans[i]=stack.get(i);
        }
        return ans;
    }
}