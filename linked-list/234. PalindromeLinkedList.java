// Last updated: 4/11/2026, 12:50:36 PM
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();

        while(head != null){
            s.push(head.val);
            head = head.next;
        }
        int left = 0;
        int right = s.size()-1;

        while(left < right){
            if(!s.get(left).equals(s.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}