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
 /* the best solution for iteration */
 /*O(n) complexity with O(1) space complexity ! */
 public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
    return prev;
}

/* another iteration solution with O(n) space*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode myDummyHead = new ListNode(-1,null);
        while( head != null)
        {
            myDummyHead.next = new ListNode(head.val, myDummyHead.next);
            head = head.next;
        }

        return myDummyHead.next;
    }

}

/* recursive solution */
public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null)
        return head;
    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;
}
