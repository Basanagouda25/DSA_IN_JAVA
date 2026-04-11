// Last updated: 4/11/2026, 12:45:03 PM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 != null){
            int gcdval = gcd(p1.val,p2.val);
            ListNode res = new ListNode(gcdval);
            p1.next = res;
            res.next = p2;

            p1 = p2;
            p2 = p2.next;
        }
        return head;
    }

    public int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}