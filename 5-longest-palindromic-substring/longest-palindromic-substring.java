class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean [][] t = new boolean [n] [n];
        String Longest = "";

        for ( int L = 0 ; L<s.length(); L ++){
            for (int i = 0 ; i+L < s.length() ; i ++){
                int j = i +L;
                if (i == j){
                    t[i][j]= true ;
                }
                else if (i + 1 == j){
                    t[i][j]= (s.charAt(i)==s.charAt(j));
                }
                else {
                    t[i][j] = (s.charAt(i)== s.charAt(j) && t[i+1][j-1]);
                }
                if (t[i][j]==true){
                    String sub = s.substring(i, j + 1);
                    if (sub.length() > Longest.length()) {
                        Longest = sub;

                }
            }
        }  
    }
     return Longest ;
}
}