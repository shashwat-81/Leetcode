class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char ofs = s.charAt(i); 
            char oft = t.charAt(i); 

            
            if (map.containsKey(ofs) && map.get(ofs) != oft) {
                return false;
            }
            if (map.containsKey(ofs) && map.get(ofs) == oft);


            else if (map.containsValue(oft)) {
                return false;
            }

            
            map.put(ofs, oft);
        }

        
        return true;
    }
}
