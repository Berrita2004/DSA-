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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        return mergeSort(head);
    }
        //first find mid 
        //sort the array like in merge sort 
        // get back all the joints in order 
        public ListNode findMid(ListNode head){
        ListNode fast = head.next ;
        ListNode slow = head ;
        while(fast != null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
        }
      return   slow;

    }
    
    public ListNode mergeSort(ListNode head){
        if ( head == null || head.next == null) return head;
        ListNode mid = findMid( head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head ;
        ListNode lefthead=  mergeSort(left);
        ListNode righthead = mergeSort(right);
        return merge2LL(lefthead,righthead);

    }
    public ListNode merge2LL(ListNode left, ListNode right){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while ( left != null && right != null){
            if (left.val <= right.val){
                temp.next = left;
                left=left.next ;
            }
            else {
                temp.next = right;
                right = right.next ;
            }
            temp= temp.next;
        }
        if (left != null){
            temp.next = left;
        }
        else {
            temp.next = right;
        }
        return dummyNode.next;
    }


    
}