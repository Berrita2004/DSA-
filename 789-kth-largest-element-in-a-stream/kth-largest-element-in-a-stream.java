class KthLargest {
int K= 0;
PriorityQueue <Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
    K=k;
        // a minheap
        
        // add to heap if heap > k ,pop from heap
        for ( int num : nums){
            pq.add(num);
            if(pq.size()> k){
                pq.poll();// min will be poped
            }
        }
        //call fuc add to add to heap 
        // return final ans
    }
    
    public int add(int val) {
        // incoming values get added to heap
        pq.add(val);
        if(pq.size()>K){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */