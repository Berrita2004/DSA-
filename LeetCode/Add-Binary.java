1class Solution {
2    public String addBinary(String a, String b) {
3        //str to int 
4        //do and op 
5        //also add carry 
6        StringBuilder res = new StringBuilder();
7        int i = a.length()-1;
8        int j = b.length()-1;
9        int carry = 0 ;
10        while ( i >=0 || j>=0 ||carry ==1){
11            int sum = carry ;
12            if (i >= 0) sum += a.charAt(i--) -'0'; //If there's a digit in a, add it (convert char to int)
13            if (j >= 0) sum += b.charAt(j--) -'0';
14            res.append(sum%2);
15            carry = sum/2;
16        }
17        return res.reverse().toString();
18
19    }   
20}