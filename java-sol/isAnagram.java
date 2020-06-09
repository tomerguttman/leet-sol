
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sAn = new int[26];
        int[] tAn = new int[26];
        
        if(s.length() != t.length())
            return false;
        for(char ch : s.toCharArray())
        {
            sAn[(int)(ch - 'a')] += 1;
        }

        for(char ch : t.toCharArray())
        {
            tAn[(int)(ch - 'a')] += 1;
        }

        for(int i = 0; i < sAn.length; i++)
        {
            if(sAn[i] != tAn[i])
                return false;
        }
        
        return true;
        
    }
}