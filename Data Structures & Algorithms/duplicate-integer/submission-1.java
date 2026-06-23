class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupeSet = new HashSet<>();
        for(int i: nums) dupeSet.add(i);
        if(dupeSet.size() == nums.length) return false;
        else return true;
    }
}