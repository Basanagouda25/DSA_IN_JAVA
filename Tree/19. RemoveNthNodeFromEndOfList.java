// Last updated: 4/11/2026, 12:52:01 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode slow = res;
        ListNode fast = res;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
            if (fast == null) {
                return head;
            }
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return res.next;
    }
}