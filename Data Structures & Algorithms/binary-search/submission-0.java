class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }

    private int search(int[] nums, int low, int high, int target){
        if(low > high) return -1;
        int mid = low + (high-low)/2;

        if(nums[mid] == target) return mid;

        if(nums[mid] < target) return search(nums, mid+1, high, target);
        else return search(nums, low, high-1, target);
    }
}
