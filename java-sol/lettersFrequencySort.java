class Solution {

    public String frequencySort(String s) 
    {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        
        char[] charArr = s.toCharArray();
        
        for (char ch: charArr) 
        {
            if ( ! map.containsKey(ch) ) 
            {
                map.put(ch, 0);
                list.add(ch);
            }
            
            map.put(ch, 1 + map.get(ch));
        }
        
        Collections.sort(list, (a,b) -> { 
            if (map.get(a) == map.get(b)) 
            { 
                return a - b; 
            }
            
            return map.get(b) - map.get(a);
        });
        
        StringBuilder sb = new StringBuilder();
        
        for (char ch: list) 
        {
            char[] arr = new char[map.get(ch)];
            Arrays.fill(arr, ch);
            sb.append(new String(arr));
        }
        
        return sb.toString();
    }
}
