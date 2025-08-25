/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //edge case 1 
        if ( head == null || head.next==null) return null;
        //length of the LL
        int count = 0 ;
        ListNode temp = head ; 
        while (temp != null){
            count++;
            temp = temp.next;
        }
        if (n==count) return head.next;

        int del = count - n ;
        int i = 1 ;  
        temp = head;
        while ( i < del){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}