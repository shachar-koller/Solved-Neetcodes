class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> s_set = new HashMap<>();
        Map<Character, Integer> t_set = new HashMap<>();

        for(char c: s.toCharArray()){
            if(s_set.containsKey(c)) s_set.put(c, s_set.get(c)+1);
            else s_set.put(c, 1);
        }

        for(char c: t.toCharArray()){
            if(t_set.containsKey(c)) t_set.put(c, t_set.get(c)+1);
            else t_set.put(c, 1);
        }

        for(char c: t.toCharArray()){
            if(!s_set.getOrDefault(c, 0).equals(t_set.getOrDefault(c, 0))) return false;
        }

        return true;

    }
}
