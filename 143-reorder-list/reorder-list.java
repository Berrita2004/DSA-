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
   
        public ListNode reverse(ListNode head ){
             ListNode curr = head ;
             ListNode prev = null ;
             while (curr != null){
                ListNode next = curr.next; 
                curr.next = prev ;
                prev = curr ; 
                curr = next ;
             }
             return prev;
        }
        public ListNode findMiddle(ListNode head ){
            ListNode hare = head ;
            ListNode turtle = head ;
            while(hare != null && hare.next != null){
                hare = hare.next.next;
                turtle= turtle.next ;
            }
            return turtle ;
        }
     public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode mid = findMiddle(head);
          
        ListNode secondHalf =  reverse(mid.next);
        mid.next = null;
        ListNode firstHalf = head;
        
        while (firstHalf != null && secondHalf != null){
            ListNode temp1 = firstHalf.next;
        ListNode temp2 = secondHalf.next;

        firstHalf.next = secondHalf;  // Merge step
        secondHalf.next = temp1;

        // Move pointers forward
        firstHalf = temp1;
        secondHalf = temp2;
        }

    }
}