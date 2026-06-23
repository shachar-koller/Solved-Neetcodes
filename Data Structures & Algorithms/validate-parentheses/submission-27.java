class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> hm = new HashMap<>();
        hm.put('}', '{');
        hm.put(')', '(');
        hm.put(']', '[');
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                if(stack.size() == 0 || stack.pop() != hm.get(c)) return false;
            } else {
                stack.push(c);
            }
        }

        if(stack.size() != 0) return false;
        return true;
    }
}
