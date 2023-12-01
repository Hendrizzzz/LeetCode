class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        StringBuilder prefix = new StringBuilder();
        int i = 0;
        char temp;
        int temp2 = Integer.MAX_VALUE;
        int length = 0;

        for (String s : strs) {
            length = Math.min(s.length(), temp2);
            temp2 = length;
        }

        while (i < length) {
            temp = strs[0].toCharArray()[i];
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].toCharArray()[i] != temp) {
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].toCharArray()[i]);
            i++;
        }
        return prefix.toString();
    }
}
