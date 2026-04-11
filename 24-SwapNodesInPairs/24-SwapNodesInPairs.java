// Last updated: 4/11/2026, 12:51:55 PM
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        prev.next = swapPairs(curr.next);
        curr.next = prev;
        return curr;
    }
}