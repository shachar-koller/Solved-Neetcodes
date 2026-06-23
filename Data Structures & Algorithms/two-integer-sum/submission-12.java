class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int goal = target-nums[i];
            if(hm.containsKey(goal)){
                if(hm.get(goal) == i) continue;
                int[] result = new int[2];
                result[0] = i;
                result[1] = hm.get(goal);
                return result;
            }
        }
        return null;
    }
}
