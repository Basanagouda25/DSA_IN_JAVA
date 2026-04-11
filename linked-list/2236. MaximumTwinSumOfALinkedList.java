// Last updated: 4/11/2026, 12:45:32 PM
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
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        Integer[] arr = st.toArray(new Integer[0]);
        int n = arr.length;
        int i = 0;
        int j = n-1-i;
        int sum=0;
        int max = 0;
        while(i < j){
            sum = arr[i] + arr[j];
            max = Math.max(sum,max);
            i++;
            j--;
        }
        return max;
    }
}