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
    public ListNode getKthNode( ListNode temp , int k){
        while (temp != null && k > 1){
            k--;
            temp= temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode temp){
        ListNode prev = null;
        while(temp != null){
           ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode temp = head ;
      ListNode prev = null;
      while ( temp != null){
        ListNode kThNode = getKthNode(temp , k);
        if (kThNode == null){
            if(prev != null) prev.next = temp ;
            break ;
        }
        ListNode nextNode = kThNode.next;
        kThNode.next = null;
        reverse(temp);
        if(temp==head){
            head = kThNode;
        }
        else {
            prev.next = kThNode;
        }
        prev = temp;
        temp = nextNode;
      } 
      return head;
    }
}