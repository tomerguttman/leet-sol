class Solution:
    def twoSum(self, numsArray, targetSum):
            already_seen = {} #dictionary
            for i, value in enumerate(numsArray): # index goes to i, and the value to value using the enumerate function.
                remaining = targetSum - value
                if remaining in already_seen:
                    return [already_seen[remaining], i]
                already_seen[value] = i
            return []