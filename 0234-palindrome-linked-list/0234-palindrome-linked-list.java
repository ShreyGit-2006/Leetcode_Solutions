class Solution {

    private ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode temp=head;

        while(temp!=null)
        {
            ListNode nextNode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextNode;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
      ListNode slow=head;
      ListNode fast = head;

      while(fast.next!=null && fast.next.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
      }
     ListNode nh=slow.next;
     slow.next=null;
     nh=reverse(nh);
     while(head!=null && nh!=null)
     {
        if(head.val != nh.val)
        {
           return false;
        }
        head=head.next;
        nh=nh.next;
     }
     return true;
    }
}