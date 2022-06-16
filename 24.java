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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head.next;
        ListNode left = head;
        ListNode right = head.next;
        while (true) {
            ListNode temp = right.next;
            right.next = left;
            if (temp == null) {
                left.next = null;
                return result;
            }
            if (temp.next == null) {
                left.next = temp;
                return result;
            } else {
                left.next = temp.next;
            }
            left = temp;
            right = temp.next;
        }
    }
}