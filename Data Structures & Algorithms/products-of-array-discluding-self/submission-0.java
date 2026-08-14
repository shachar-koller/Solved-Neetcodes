class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //first, compute both the prefix product array and the suffix product array
        
        int[] pre = new int[nums.length];
        pre[0] = nums[0];

        int[] post = new int[nums.length];
        post[nums.length-1] = nums[nums.length-1];

        for(int i = 1; i < nums.length; i++){
            pre[i] = (nums[i] * pre[i-1]);
        }
        for(int i = nums.length-2; i >= 0; i--){
            post[i] = (nums[i] * post[i+1]);
        }

        /* for the output, result for index i is equal to everything
        before i in the prefix array multiplied by everything
        after i in the suffix array. handle the first and last
        result seperately to avoid error. 
        */

        int[] output = new int[nums.length];
        int len = output.length;

        output[0] = post[1];
        output[len-1] = pre[len-2];
        for(int i = 1; i < output.length-1; i++){
            output[i] = (pre[i-1] * post[i+1]);
        }

        return output;


    }
}  
