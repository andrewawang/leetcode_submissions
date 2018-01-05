/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstHead = head;
        ArrayList<ListNode> result = new ArrayList<>();
        while (head != null) {
            result.add(head);
            head = head.next;
        }
        result.add(null);
        if (result.size() - 1 == n) {
            return result.get(1);
        }
        result.get(result.size() - (n + 2)).next = result.get(result.size() - n);
        
        return firstHead;
    }
}
