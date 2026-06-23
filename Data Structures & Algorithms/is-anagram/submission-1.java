class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<String, Integer> mapy = new HashMap<String, Integer>();
        String[] ss = s.split("");
        String[] tt = t.split("");

        for(String ch: ss){
            mapy.put(ch, mapy.getOrDefault(ch, 0) + 1);
        }

        for(String ch: tt){
            mapy.put(ch, mapy.getOrDefault(ch, 0) - 1);
        }
        
        for(String sss: mapy.keySet()){
            if(mapy.get(sss) != 0){
                return false;
            }
        }
        return true;
    }
}
