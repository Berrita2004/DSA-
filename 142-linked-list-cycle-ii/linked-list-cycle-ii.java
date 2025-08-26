/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if ( head == null ) return null;
       HashMap<ListNode, Integer> mpp = new HashMap<>();
       ListNode temp = head;
       while(temp != null){
        if(mpp.containsKey(temp)){
            return temp;
        }
        mpp.put(temp,0);
        temp = temp.next;
       }
    return null;
    }
}