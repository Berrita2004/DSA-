import java.util.*;

class MinStack {
    Deque<Long> st;
    long min;

    public MinStack() {
        st = new ArrayDeque<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long)val);
            min = val;
        } else if (val >= min) {
            st.push((long)val);
        } else {
            // store encoded value
            st.push(2L * val - min);
            min = val;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;
        long top = st.pop();
        if (top < min) {
            // decode previous min
            min = 2 * min - top;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1; // not required on LeetCode, but safe
        long top = st.peek();
        return top >= min ? (int)top : (int)min;
    }

    public int getMin() {
        if (st.isEmpty()) return -1; // not required on LeetCode, but safe
        return (int)min;
    }
}
