// Last updated: 4/11/2026, 12:52:00 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> m = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                m.push(ch);
            } else {
                if (m.isEmpty()) {
                    return false;
                }
                char top = m.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return m.isEmpty();
    }
}