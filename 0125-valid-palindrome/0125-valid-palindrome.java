class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while(leftPointer < rightPointer){
            if (!Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
                continue;
            }
            
            if (s.charAt(leftPointer) != s.charAt(rightPointer)){
                return false;
            } else{
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
}