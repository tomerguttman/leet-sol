class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];
        for(int i = 1 ; i < strs.length; i++)
        {
            while(strs[i].indexOf(prefix) != 0) //does not start from index 0 - which is exactly what we want!
            {
                prefix = prefix.substring(0,prefix.length() - 1); //cut the last letter.
                if(prefix.isEmpty())// check if my prefix is empty - if it does we will never have a common prefix with all of the strings.
                {
                    return "";
                }
            }
        }

        return prefix;
    }
}