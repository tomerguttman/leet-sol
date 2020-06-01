# Definition for singly-linked list.
#  class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        myList = None
        l1Pointer = l1
        l2Pointer = l2
        tempNode = myList
        while l1Pointer is not None:
            tempNode = ListNode(l1Pointer.val + l2Pointer.val)
            if myList is None:
                myList = tempNode
                myListPointer = tempNode
            else:
                

           

            
