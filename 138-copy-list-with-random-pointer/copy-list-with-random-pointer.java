/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // adding copy to the original LL
        Node temp = head ; while (temp!= null){
            Node copy = new Node (temp.val);
            copy.next = temp.next ;
            temp.next = copy ;
            temp = temp.next.next;
        }

        temp = head ; 
        while ( temp != null){
            Node copy = temp.next;
            copy.random = (temp.random != null) ? temp.random.next : null;
            temp = temp.next.next;
        }

        Node dummy = new Node(-1);
        Node cur = dummy ;
        temp = head ; 
         while (temp != null) {
        Node copy = temp.next;
            cur.next = copy;
            cur = copy;

            temp.next = copy.next; // Restore original list
            temp = temp.next; 
         }
        return dummy.next ;
    }
}