class Solution {
  static int []  nextSmallerElement(int [] arr){
    //dont use arraylist its troublesome
        Stack <Integer> st = new Stack<>();
        int n = arr.length;
       int[] nse = new int[n];
        for ( int i = arr.length-1; i >= 0 ; i--){
            //arr[st.peek()] not st.peek()
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
         nse[i] = st.isEmpty() ? n : st.peek(); 
            st.push(i);
         
     
       
    }
     return nse ;
  }

 static int [] previousSmallerElement(int [] arr){
        Stack <Integer> st = new Stack<>();
        int n = arr.length;
         int[] pse = new int[n];
        for ( int i = 0 ; i < arr.length;i++){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
        }
        // this comes outside the while after the computation
        pse[i] = st.isEmpty() ? -1 : st.peek();
              st.push(i);
      
    }
      return pse ;
 }


    public int sumSubarrayMins(int[] arr) {
        long mod = 1_000_000_007;
        long sum = 0 ;
        int n = arr.length; //initialze n every where 

        int[] p = previousSmallerElement(arr);
        int [] q =  nextSmallerElement(arr);
        for ( int i = 0 ; i < n ; i++){
            int prevS = i - (p[i]);
            int nextS = (q[i]) - i;
            sum =(sum + (long)arr[i] * prevS * nextS) % mod;
        }
        return (int )sum ;
    }
}