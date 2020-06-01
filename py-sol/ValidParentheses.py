class Solution:
    def isValid(self, input_string):
        parentheses_stack = []
        my_dict = {'(':')','[':']','{':'}'}
        for parentheses in input_string:
            if parentheses in my_dict:
                parentheses_stack.append(my_dict[parentheses])
            else:
                #closing bracket
                if len(parentheses_stack) == 0 or parentheses_stack.pop() != parentheses:
                     return False
        if len(parentheses_stack) == 0:
            return True
        else:
            return False
