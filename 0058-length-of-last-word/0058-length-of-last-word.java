class Solution {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}