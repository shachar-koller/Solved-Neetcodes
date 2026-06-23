class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> hm = new HashMap<>();
        Map<Character, Boolean> mapped = new HashMap<>();

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        
        for(int i = 0; i < sCharArray.length; i++){
            if(hm.get(sCharArray[i]) == null && !mapped.containsKey(tCharArray[i])){
                hm.put(sCharArray[i], tCharArray[i]);
                mapped.put(tCharArray[i], true);
                continue;
            } else if(hm.get(sCharArray[i]) == null){
                return false;
            } else if(hm.get(sCharArray[i]) == tCharArray[i]){
                continue;
            } else if(hm.get(sCharArray[i]) != tCharArray[i]){
                return false;
            }
        }
        return true;
    }
}