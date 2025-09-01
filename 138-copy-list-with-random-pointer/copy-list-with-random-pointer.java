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
        if (head == null) return null;

        // Map original node → copied node
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;

        // 1st pass: create copy nodes
        while (temp != null) {
            map.put(temp, new Node(temp.val));  // new node with same value
            temp = temp.next;
        }

        // 2nd pass: assign next and random
        temp = head;
        while (temp != null) {
            Node copy = map.get(temp);
            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);
            temp = temp.next;
        }

        return map.get(head);
    }
}
