class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> map1 = new HashMap<>();
        
        for(char a : s.toCharArray()){
            map1.put(a, map1.getOrDefault(a, 0) + 1);
        }
        
        for(char a : t.toCharArray()){
            map1.put(a, map1.getOrDefault(a, 0) - 1);
        }
        
        for(Integer a : map1.values()){
            if (a != 0) return false;
        }
        
        return true;
    }
}