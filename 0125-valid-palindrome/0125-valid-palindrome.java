public class Solution {
    public boolean isPalindrome(String s) {
        // Clean the string (remove non-alphanumeric characters and convert to lowercase)
        String cleanedString = cleanString(s);
        
        // Check if the cleaned string is a palindrome
        return cleanedString.equals(new StringBuilder(cleanedString).reverse().toString());
    }

    private String cleanString(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        return cleaned.toString();
    }
}
