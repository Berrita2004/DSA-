class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack <>();
        
        for (int i = 0 ; i < asteroids.length; i ++){
            if (asteroids[i]> 0){
                st.push(asteroids[i]);
                //positive element
            }
            else {
                // if the -ve is greater than top element
                while (!st.isEmpty() && st.peek() > 0 && Math.abs(asteroids[i])> st.peek() ){
                    st.pop();
                }
            
            if (!st.isEmpty() &&  st.peek()>0 &&  Math.abs(asteroids[i]) == st.peek()) {
                st.pop();
                //if dono ki values same hai toh pop kar do 
            }
            else if (st.empty () || st.peek() <0 ) //if its negative element
            {
                st.push (asteroids[i]);
            }
            }

        }
        int [] res = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
             res[i] = st.pop();
        }
        return res;
    }
}