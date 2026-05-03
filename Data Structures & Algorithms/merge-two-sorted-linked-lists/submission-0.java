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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalList = null;
        List<ListNode> list = new ArrayList<>();
    
        while (list1 != null || list2 != null) {
            ListNode node = new ListNode();
            if (list1 == null) {
                node = list2;
                list2 = null;
            } else if (list2 == null) {
                node = list1;
                list1 = null;
            } else {
                int value = 0;
                if (list1.val <= list2.val) {
                    value = list1.val;
                    list1 = list1.next;
                } else {
                    value = list2.val;
                    list2 = list2.next;
                }
                node.val = value;
                node.next = null;
            }

            list.add(node);
        }
        
        if (!list.isEmpty()) {
            int i = list.size()-1;
            while(i>=0) {
                System.out.println(list.get(i).val);
                if (finalList == null) {
                    finalList = new ListNode(list.get(i).val, list.get(i).next);
                } else {
                    //ListNode node = list.get(i)
                    list.get(i).next = finalList;
                    finalList = list.get(i);
                }
                i=i-1;
            }
        }

        return finalList;
    }
}