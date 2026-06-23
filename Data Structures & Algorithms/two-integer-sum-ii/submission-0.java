class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int j = n-1;
        int i = 0;

        int[] result = new int[2];
        int currentSum = 0;
        while(i < j){
            currentSum = numbers[i]+numbers[j];

            if(currentSum > target) j--;
            if(currentSum < target) i++;
            
            if(currentSum == target){
                result[0] = i+1; result[1] = j+1;
                return result;
            }
        }
            
        return result;
    }
}
