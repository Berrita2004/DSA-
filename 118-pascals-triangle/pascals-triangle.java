class Solution {
    public List<List<Integer>> generate(int numRows) {  
        List<List<Integer>> ans = new ArrayList<>();
        for( int i = 0; i < numRows; i++){
            List <Integer> temp = new ArrayList<>();
            for (int col = 0; col<=i ; col++){
                temp.add(nCr(i, col));
            }
            ans.add(temp);

        }
        return ans;
    }



        public static int nCr(int n , int r ){
            int res = 1 ;
            for ( int i = 0 ; i < r; i ++){
                res = res * (n-i);
                res = res/(i+1);

            }
            return res;


        }
    
}