// Last updated: 4/11/2026, 12:51:54 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupTail = dummy, curr = head;

        while (true) {
            // Check if there are at least k nodes left
            ListNode groupEnd = curr;
            int count = 0;
            while (count < k && groupEnd != null) {
                groupEnd = groupEnd.next;
                count++;
            }
            if (count < k) break;

            // Reverse the current group
            ListNode prev = groupEnd, groupStart = curr;
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect the previous group to the reversed group
            prevGroupTail.next = prev;
            prevGroupTail = groupStart;
        }

        return dummy.next;
    }
}