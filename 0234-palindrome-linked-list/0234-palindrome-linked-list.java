class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack1 = new Stack<>();

        ListNode temp = head;

        while (temp != null) {
            stack1.push(temp.val);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (stack1.pop() != temp.val) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}