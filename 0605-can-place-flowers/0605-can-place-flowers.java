class Solution {
    
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++){
            if (n == 0){
                    return true;
                }
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ){
                n--;
                if (n == 0){
                    return true;
                }
                flowerbed[i] = 1;
                i++;
            }
         
        }

        return (n == 0);
    }
    
    
    
}