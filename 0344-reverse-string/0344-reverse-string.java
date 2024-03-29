class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0) return;
        int left = 0;
        int right = s.length - 1;

        while(left <right){
            if (s[left] != s[right]){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
            }

            left++;
            right--;
        }
    }
}