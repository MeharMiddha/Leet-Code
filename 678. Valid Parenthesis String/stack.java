import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openBrackets = new Stack<>();
        Stack<Integer> asterisks = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                openBrackets.push(i);
            } else if (ch == '*') {
                asterisks.push(i);
            } else if (ch == ')') {
                if (!openBrackets.isEmpty()) {
                    openBrackets.pop();
                } else if (!asterisks.isEmpty()) {
                    asterisks.pop();
                } else {
                    return false;
                }
            }
        }
        
        while (!openBrackets.isEmpty() && !asterisks.isEmpty()) {
            if (openBrackets.peek() > asterisks.peek()) {
                return false;
            }
            openBrackets.pop();
            asterisks.pop();
        }
        
        return openBrackets.isEmpty();
    }
}
