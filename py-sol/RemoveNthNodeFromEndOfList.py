# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
            
class Solution:
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(0,None)
        dummy.next = head
        listLength = self.length(head)
        listLength -= n
        current = dummy
        while listLength > 0:
            listLength -= 1
            current = current.next
        current.next = current.next.next
        return dummy.next

    def length(self,head):
        count = 0
        current = head
        while current:
            count += 1
            current = current.next
        return count
        