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
    public ListNode deleteMiddle(ListNode head) {
        if ( head == null ||head.next == null) return null;
        int cnt = 0 ;
        ListNode temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        temp =head;
        int mid = cnt/2;
        for ( int i = 0 ; i < mid-1; i++){
            temp= temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}