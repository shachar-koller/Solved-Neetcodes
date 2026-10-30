class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();

        List<List<String>> result = new ArrayList<>();
        
        for(String s: strs){
            int[] strArray = new int[26];
            for(int i = 0; i < s.length(); i++){
                int index = s.charAt(i)-'a';
                strArray[index]++;
            }

            String key = Arrays.toString(strArray);

            List<String> current = strMap.getOrDefault(key, new ArrayList<>());
            current.add(s);
            strMap.put(key, current);
        }

        return new ArrayList<>(strMap.values());
    }
}
