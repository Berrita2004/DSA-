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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        // Collect odd index nodes
        int idx = 1;
        while (temp != null) {
            if (idx % 2 == 1) arr.add(temp.val);
            temp = temp.next;
            idx++;
        }

        // Collect even index nodes
        temp = head;
        idx = 1;
        while (temp != null) {
            if (idx % 2 == 0) arr.add(temp.val);
            temp = temp.next;
            idx++;
        }

        // Rewrite values into linked list
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }
}
