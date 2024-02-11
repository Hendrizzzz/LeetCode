class Solution {
    public boolean isSubsequence(String s, String t) {
        
        Queue<Character> q = new ArrayDeque<>();
        for(char a : s.toCharArray()){
            q.offer(a);
        }
        
        for(char a : t.toCharArray()){
            if(q.isEmpty()) return true;
            if(q.element() == a){
                q.poll();
            }
        }
        
        return q.isEmpty();
    }
}