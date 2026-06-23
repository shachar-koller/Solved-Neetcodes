class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> sCharMap = new HashMap<>();
        Map<Character, Integer> tCharMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(sCharMap.containsKey(c)){
                int old = sCharMap.get(c);
                sCharMap.put(c, old+1);
            } else {
                sCharMap.put(c, 1);
            }
            if(tCharMap.containsKey(d)){
                int old = tCharMap.get(d);
                tCharMap.put(d, old+1);
            } else {
                tCharMap.put(d, 1);
            }
        }

        return sCharMap.equals(tCharMap);
    }
}
