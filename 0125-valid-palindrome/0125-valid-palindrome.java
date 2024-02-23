class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return false;
        }
        
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
            
            if (Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            } else{
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
}