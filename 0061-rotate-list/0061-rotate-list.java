class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int len = 1;

        while(temp.next != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;

        if(k == 0)
            return head;

        temp.next = head;

        int steps = len - k - 1;
        ListNode curr = head;

        for(int i = 0; i < steps; i++) {
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;

        return head;
    }
}