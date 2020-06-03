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
    public boolean isPalindrome(ListNode head)
    {
        boolean o_output = true;
        ListNode myReverseList = reverseList(head);
        while (head != null && myReverseList != null)
        {
            if (head.val != myReverseList.val)
            {
                o_output = false;
                break;
            }

            head = head.next;
            myReverseList = myReverseList.next;
        }

        if ((head == null && myReverseList != null) || (head != null && myReverseList == null))
            o_output = false;

        return o_output;
    }

    public ListNode reverseList(ListNode head)
    {
        ListNode myDummyHead = new ListNode(-1,null);
        while( head != null)
        {
            myDummyHead.next = new ListNode(head.val, myDummyHead.next);
            head = head.next;
        }

        return myDummyHead.next;
    }
}
