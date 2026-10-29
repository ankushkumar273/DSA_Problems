class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast:asteroids){
            boolean alive = true;
            while(alive && !st.isEmpty() && st.peek()>0 && ast<0){
                if(st.peek() > Math.abs(ast)){
                    alive = false;
                }else if(st.peek() == Math.abs(ast)){
                    st.pop();
                    alive = false;
                }else{
                    st.pop();
                }
            }
            if(alive){
                st.push(ast);
            }
        }
        int result[] = new int[st.size()];
        for(int i=0; i<st.size(); i++){
            result[i] = st.get(i);
        }
        return result;
    }
}