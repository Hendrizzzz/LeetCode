class Solution {
    
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        ArrayList<Integer> stack = new ArrayList<>(20);
        stack.add(0);
        for (int flower : flowerbed){
            stack.add(flower);
        }
        stack.add(0);
        
        for (int i = 1; i < stack.size() - 1; i++){
            if (n == 0){
                return true;
            }
            
            if (stack.get(i - 1) == 0 && stack.get(i) == 0 && stack.get(i + 1) == 0){
                stack.set(i, 1);
                n--;
                i++;
            }
        }

        return (n == 0);
    }
    
    
    
}