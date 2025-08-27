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
        ArrayList <Integer> arr = new ArrayList<>(); // i forgot syntax
        ListNode temp = head ; 
        while ( temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        //Sorting ArrayList → Arrays.sort() is for arrays, not ArrayList.
       Collections.sort(arr);
        temp = head ;
        int i = 0 ; 
        while( temp != null){
            temp.val = arr.get(i);//whst the syntax again ?
            i++;
            temp = temp.next;
        }
        return head;
    }
}