class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while(leftPointer < rightPointer){
            char left = s.charAt(leftPointer);
            char right = s.charAt(rightPointer);
            
            if (!Character.isLetterOrDigit(left)){
                leftPointer++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)){
                rightPointer--;
                continue;
            }
            
            if (left != right){
                return false;
            } else{
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
}