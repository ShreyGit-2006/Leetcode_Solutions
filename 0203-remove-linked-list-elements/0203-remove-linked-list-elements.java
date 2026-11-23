class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node sits before head so deleting the first node works like any other node
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode temp = head;

        while (temp != null) {
            if (temp.val == val) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}