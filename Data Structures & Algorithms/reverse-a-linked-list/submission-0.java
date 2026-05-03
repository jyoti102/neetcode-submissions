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
    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        if (head != null) {
            node = new ListNode(head.val, null);
            while (null != head.next) {
                head = head.next;
                ListNode newNode = new ListNode(head.val, node);
                node = newNode;
            }
        }
        return node;
    }
}
