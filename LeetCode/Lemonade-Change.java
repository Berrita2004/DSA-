1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five =0 ;
4        int ten = 0 ; 
5        for ( int i = 0 ; i < bills.length; i++){
6            if (bills[i]== 5){
7                five ++;
8            }
9            else if(bills[i] == 10){
10                if(five>0){
11                     five--; 
12                     ten++;   
13                }
14                
15                else return false;
16               
17            }
18            else {
19                if(ten > 0 && five > 0){
20                    ten --;
21                    five--;
22                }
23                else if (five >= 3){
24                    five = five - 3;
25                }
26                else return false;
27                
28            }
29        }
30        return true;
31    }
32}