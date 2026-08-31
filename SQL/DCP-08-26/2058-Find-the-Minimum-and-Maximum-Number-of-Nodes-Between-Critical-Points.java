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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
     ListNode curr = head.next;
     ListNode prev = head;
     int prevCPpos = 0;
     int firstCPpos= 0;
     int i = 1;
     int minDist = Integer.MAX_VALUE;
          while(curr.next != null){
        if(curr.val >prev.val && curr.val> curr.next.val ||curr.val < prev.val && curr.val < curr.next.val ){
            if ( prevCPpos == 0){
                 prevCPpos = i;
                 firstCPpos = i;
            }
            else {
                minDist = Math.min(minDist, i- prevCPpos);
                 prevCPpos = i;
            }
           
        }
         i++;
            prev = curr;
            curr = curr.next;
     }
     if (firstCPpos == -1 || prevCPpos == firstCPpos) {
       return new int[]{-1, -1};
     }
    return new int[]{minDist, prevCPpos - firstCPpos};
    }
}