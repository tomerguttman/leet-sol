class Solution:
    def romanToInt(self, i_str):
        sum = 0
        romanDict = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000,'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
        indx = 0
        while indx < len(i_str):
            if indx+1 < len(i_str) and i_str[indx:indx+2] in romanDict:
                sum += romanDict[i_str[indx:indx+2]]
                indx += 2
            else:
                sum += romanDict[i_str[indx]]
                indx += 1
        return sum
        
        