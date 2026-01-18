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
    public ListNode mergeKLists(ListNode[] lists) {
        // make a minheap
        //add first element of K LL in the minheap
        //return head
        PriorityQueue <ListNode> pq = new PriorityQueue <>((a,b) -> (a.val- b.val));
        for (ListNode node : lists){
            if(node!= null){
                pq.add(node);
            }
        }
        //Dummy head result;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (!pq.isEmpty()){
            ListNode curr= pq.poll();
            tail.next = curr;
            tail = tail.next;

            if(curr.next != null){
                pq.add(curr.next);
            }
        }
        return dummy.next;

    }
}