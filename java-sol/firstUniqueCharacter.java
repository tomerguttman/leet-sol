class Solution 
{
    public int firstUniqChar(String s)
    {
    	int [] array = new int [26];
    	for(int i = 0; i < s.length(); i++)
    	{
    		array[s.charAt(i) - 'a'] += 1;
    	}
    		
    	for(int i = 0; i < s.length(); i++)
    	{
    		if (array[s.charAt(i) - 'a'] == 1)
    		{
    			return i;
    		}
    	}
    		
		return -1;
    }
    
    public int firstUniqChar(String s) 
    {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}

