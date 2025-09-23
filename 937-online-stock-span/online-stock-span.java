class StockSpanner {
    private Stack<int[]> st;
     private int idx;
 
    public StockSpanner() {
        idx = -1;
        st = new Stack<>();
    }
    
    public int next(int price) {
        idx ++;
        //implementing Prev greater element wala code
        while(!st.isEmpty() && st.peek()[0] <= price){
            st.pop();
        }
        int span = st.isEmpty() ? (idx +1) : (idx - st.peek()[1]);
        st.push(new int []{price,idx});
        return span ;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */