class Solution:
    def removeElement(self, nums, val):
       amountVal = nums.count(val)
       for i in range(amountVal):
          nums.remove(val)
       return len(nums)
     
          
        