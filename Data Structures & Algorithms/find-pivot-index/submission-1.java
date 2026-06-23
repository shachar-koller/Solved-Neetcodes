class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;

        int[] pSum = new int[len];
        pSum[0] = nums[0];
        for(int i = 1; i < len; i++){
            pSum[i] = pSum[i-1]+nums[i];
        }

        if(pSum[0] == pSum[len-1]) return 0;
        
        for(int i = 1; i < len; i++){
            if(pSum[i-1] == (pSum[len-1] - pSum[i])) return i;
        }
        return -1;
    }
}