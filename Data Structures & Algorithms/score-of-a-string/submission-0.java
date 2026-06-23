class Solution {
    public int scoreOfString(String s) {
        int value = 0;
        for(int i = 1; i < s.length(); i++){
            int charValue1 = s.charAt(i-1);
            int charValue2 = s.charAt(i);
            
            value += Math.abs(charValue2 - charValue1);
        }
        return value;
    }
}