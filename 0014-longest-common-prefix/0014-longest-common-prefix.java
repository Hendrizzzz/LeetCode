class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length - 1];
        int length = Math.min(a.length(), b.length());
        int index = 0;
        for(int i = 0; i < length; i++){
            if (a.charAt(i) == b.charAt(i)) index++;
            else break;
        }
        
        return a.substring(0, index);
        
    }
}
