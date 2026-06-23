class Solution {
    public int[] getConcatenation(int[] nums) {
        int oglen = nums.length;
        int[] result = new int[oglen*2];
        for(int i = 0; i < oglen; i++){
            result[i] = nums[i];
            result[i+oglen] = nums[i];
        }
        return result;
    }
}