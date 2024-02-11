class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int highest = arr[i + 1];
            for(int j = i + 1; j < arr.length -1; j++){
                if(highest < arr[j + 1]){
                    highest = arr[j + 1];
                }
            }
            arr[i] = highest;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}