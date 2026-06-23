class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int j = clean.length()-1;
        for(int i = 0; i <= j; i++, j--){
            if(clean.charAt(i) != clean.charAt(j)) return false;
        }
        return true;
    }
}
