class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums){
            numSet.add(n);
        }

        if(numSet.size() != nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}