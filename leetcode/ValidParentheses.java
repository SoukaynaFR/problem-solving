import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

      Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);

 } else {
                // If stack is empty, no match
                if (st.isEmpty()) return false;

                char top = st.peek();

                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    st.pop(); // remove the matched opening bracket
                } else {
                    return false; // mismatch
                }
            }
        }

        return st.isEmpty();

        
    }
}