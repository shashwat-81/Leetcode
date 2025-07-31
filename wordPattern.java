class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> map = new HashMap<>();
        String[] word = s.trim().split(" ");
        if (pattern.length() != word.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            String s1 = word[i];
            char ch = pattern.charAt(i);

            if (map.containsKey(s1)) {
                if (map.get(s1) != ch)
                    return false;
            } else {
                if (map.containsValue(ch))
                    return false;
                map.put(s1, ch);
            }
        }

        return true;
    }
}