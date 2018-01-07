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
        if (head == null) {
            return head;
        }
        ArrayList<ListNode> seen = new ArrayList<>();
        while (head.next != null) {
            if (seen.contains(head.next)) {
                return head.next;
            }
            seen.add(head);
            head = head.next;
        }
        return null;
    }
}
