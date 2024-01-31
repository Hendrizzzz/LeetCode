import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1 || s.isEmpty()) return false;
        Deque<Character> groups = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(current == '(' || current == '[' || current == '{'){
                groups.push(current);
            } else {
                if(groups.isEmpty()) return false;
                char recentOpening = groups.element();
                if(recentOpening == '[' && current == ']' ||
                        recentOpening == '{' && current == '}' ||
                        recentOpening == '(' && current == ')') {
                    groups.pop();
                } else return false;
            }
        }

        return groups.isEmpty();
    }
}