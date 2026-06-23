class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> hm = new HashMap<>();
        hm.put('}', '{');
        hm.put(')', '(');
        hm.put(']', '[');
        
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                if(stack.size() == 0 || stack.pop() != hm.get(s.charAt(i))) return false;
            } else {
                stack.push(s.charAt(i));
            }
        }

        if(stack.size() != 0) return false;
        return true;
    }
}
