import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesesChecker {
    public boolean checkParentheses(String testString) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < testString.length(); i++) {
            char x = testString.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } else if (x == ')' || x == ']' || x == '}') {
                if (stack.isEmpty())
                    return false;
                char check = stack.pop();
                if ((x == ')' && check != '(') ||
                        (x == ']' && check != '[') ||
                        (x == '}' && check != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // Check if any opening brackets are left in the stack
    }
}
