class Solution {
     public static boolean isPalindrome(int x) {

        int right = 10;
        int length = String.valueOf(x).length();
        int left = length;
        int tempRight = 1;
        int i = 0;

        if(x < 0) return false;

        while(length/2 > i){
            if((x / (int) Math.pow(10, left - 1) % 10) != ((x % right) / tempRight)){
                return false;
            }
            tempRight *= 10;
            right *= 10;
            left--;
            i++;
        }

        return true;
    }
}