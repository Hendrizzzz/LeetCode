class Solution {
    public boolean halvesAreAlike(String s) {
        char[] sArray = s.toLowerCase().toCharArray();
        int firstHalf = (sArray.length) / 2;
        int firstHalfCounter = 0;
        int secondHalfCounter = 0;

        for (int i = 0; i < sArray.length; i++) {
            boolean b = sArray[i] == 'a' || sArray[i] == 'e' || sArray[i] == 'i' || sArray[i] == 'o'
                    || sArray[i] == 'u';
            if (i < firstHalf) {
                if (b) {
                    firstHalfCounter++;
                }
            } else {
                if (b) {
                    secondHalfCounter++;
                }
            }
        }

        return (firstHalfCounter == secondHalfCounter);
    }
}