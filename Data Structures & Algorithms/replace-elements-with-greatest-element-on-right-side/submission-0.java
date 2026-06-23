class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        
        int[] aux = new int[len];

        for(int i = 0; i < len; i++){
            aux[i] = getMaxToRightOfMe(i, arr);
        }

        aux[len-1] = -1;
        return aux;
    }

    private int getMaxToRightOfMe(int i, int[] arr){
        int[] newArr = Arrays.copyOfRange(arr, i+1, arr.length);
        int maxElement = 0;
        for(int j = 0; j < newArr.length; j++){
            if(newArr[j] > maxElement) maxElement = newArr[j];
        }
        return maxElement;
    }
}