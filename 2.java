class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num, sum;
        ListNode result = new ListNode();
        ListNode current = result;
        int plus1 = 0;
        while(l1 != null || l2 != null) {
            int add1 = 0, add2 = 0;
            if (l1 != null) {
                add1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                add2 = l2.val;
                l2 = l2.next;
            }
            sum = add1 + add2 + plus1;
            if (sum > 9) {
                num = sum % 10;
                plus1 = 1;
            } else {
                num = sum;
                plus1 = 0;
            }
            current.next = new ListNode(num);
            current = current.next;
        }
        if (plus1 == 1) {
            current.next = new ListNode(1);
        }
        return result.next;
    }
}