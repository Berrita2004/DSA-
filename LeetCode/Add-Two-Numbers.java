1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 * int val;
5 * ListNode next;
6 * ListNode() {}
7 * ListNode(int val) { this.val = val; }
8 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13           ListNode dummy = new ListNode(-1);
14           ListNode cur = dummy;
15           int carry = 0 ;
16          
17          
18           while(l1!= null || l2 != null){
19            int sum = carry;
20            if(l1!= null ){ sum += l1.val; l1=l1.next;}
21            if(l2!= null) { sum+= l2.val; l2=l2.next;}
22
23
24            ListNode newNode = new ListNode(sum % 10);
25            carry = sum/10;
26
27            cur.next =newNode;
28            cur=cur.next;
29           }
30
31            if(carry > 0){
32                cur.next =new ListNode (carry);
33
34            }
35           
36           return dummy.next ;
37    }
38}