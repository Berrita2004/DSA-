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
    public boolean isPalindrome(ListNode head) {
    ListNode fast = head ;
    ListNode slow = head ;
    while ( fast.next!=null && fast.next.next!= null ){
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode newHead = reverse(slow.next);
    ListNode first = head ;
    ListNode sec = newHead;
    while(sec!=null){
        if (first.val != sec.val){
            reverse(newHead);
            return false ;
        }
        first = first.next;
        sec = sec.next;
    }
    reverse(newHead);
    return true ;

    }
    public ListNode reverse(ListNode newHead){
        ListNode prev= null ;
        ListNode temp = newHead ;
        while( temp != null){
            ListNode front = temp.next ; 
            temp.next = prev;
            prev = temp ; 
            temp = front ;
        } 
        return prev;
    }
}