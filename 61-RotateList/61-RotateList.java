// Last updated: 4/11/2026, 12:51:35 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        temp.next = head;
        k = k%length;
        if(k%length == 0){
            temp.next = null;
            return head;
        }
        ListNode tail = head;
        for(int i=1; i<length-k; i++){
            tail = tail.next;
        }
        ListNode newhead = tail.next;
        tail.next = null;
        head = newhead;
        return head;
    }
}