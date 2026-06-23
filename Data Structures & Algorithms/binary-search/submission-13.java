class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        return search(nums, low, high, target);

    }

    private int search(int[] nums, int low, int high, int target){
        int mid = low + (high - low) / 2;

        if(low > high) return -1;

        if(nums[mid] == target){
            return mid;
        } else if(nums[mid] > target){
            return search(nums, low, mid-1, target);
        } else if(nums[mid] < target){
            return search(nums, mid+1, high, target);
        }
        return -1;
    }
}
