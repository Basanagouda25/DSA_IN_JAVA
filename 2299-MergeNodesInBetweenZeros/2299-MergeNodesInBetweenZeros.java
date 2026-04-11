// Last updated: 4/11/2026, 12:45:27 PM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode newnode = dummy;
        ListNode p1 = head.next;
        int sum = 0;
        while(p1 != null){
            if(p1.val !=0){
                sum = sum+p1.val;
            }else{
                newnode.next = new ListNode(sum);
                newnode = newnode.next;
                sum = 0;
            }
            p1 = p1.next;
        }
        return dummy.next;
    }
}