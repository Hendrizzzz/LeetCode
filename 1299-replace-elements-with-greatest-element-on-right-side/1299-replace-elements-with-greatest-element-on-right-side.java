class Solution {
    public int[] replaceElements(int[] arr) {
        int[] num = new int[arr.length];
        
        for(int i = arr.length - 1; i >= 0; i--){
            if(i == arr.length - 1) {
                num[i] = -1;
                continue;
            }
            int highest = arr[i + 1];
            for(int j = i + 1; j < arr.length; j++){
                if(highest < arr[j]){
                    highest = arr[j];
                }
            }
            num[i] = highest;
        }
        return num;
    }
}