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
        // 1. Clone
        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }

        // 2. Assign random
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        
        // 3. Separate lists
        Node dummy = new Node(0);
        Node copy = dummy;
        cur = head;

        while (cur != null) {
            copy.next = cur.next;
            cur.next = copy.next.next;
            copy = copy.next;

            cur = cur.next;
        }

        return dummy.next;
    }
}