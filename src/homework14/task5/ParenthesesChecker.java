package homework14.task5;

import java.util.Stack;

public class ParenthesesChecker {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string1 = "((()))";
        String string2 = "[{()}]";
        String string3 = "(()))";

        System.out.println("Is '" + string1 + "' balanced? - " + isBalanced(string1));
        System.out.println("Is '" + string2 + "' balanced? - " + isBalanced(string2));
        System.out.println("Is '" + string3 + "' balanced? - " + isBalanced(string3));
    }
}
