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
    //find the tail 
    public ListNode findNode(ListNode temp, int k){
        int cnt = 1;
        while (temp != null){
            if(cnt ==k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
    // tail is the new head , the next after tail is the new head , and the og tail joins the real head ;
    public ListNode rotateRight(ListNode head, int k) {
        if ( head==null || k ==0) return head;
        int cnt = 1 ;
        //og tail 
        ListNode tail = head ;
        while( tail.next != null){
            cnt++ ;
            tail = tail.next;
        }
        if ( k%cnt == 0) return head ;
        k = k% cnt;
        tail.next = head ;
        ListNode newLastNode = findNode (head,cnt-k);
        head = newLastNode.next ;
        newLastNode.next = null;

        return head;
        }
        
    //dry run revison 
}