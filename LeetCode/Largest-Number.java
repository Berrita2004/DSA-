1class Solution {
2    public String largestNumber(int[] arr) {
3    StringBuilder sb = new StringBuilder();
4    String[] str = new String[arr.length];
5
6    for (int i = 0; i < arr.length; i++) {
7        str[i] = String.valueOf(arr[i]);
8       }
9       //comparator 
10    Arrays.sort(str, (a,b)-> (b+a).compareTo(a+b));
11     //loop final wala
12    for (String s : str) {
13        sb.append(s);
14    }
15    if (str[0].equals("0")) return "0";
16
17    return sb.toString();
18    }
19}