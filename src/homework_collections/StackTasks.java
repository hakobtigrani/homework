package homework_collections;

import java.util.Stack;

public class StackTasks {
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));

        System.out.println(reverse("Hakob"));
    }

    public static boolean isBalanced(String string) {
        Stack<Character> stack = new Stack<>();

        for (char ch : string.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) return false;
            }
        }
        return stack.isEmpty();
    }

    public static String reverse(String string) {
        Stack<Character> stack = new Stack<>();

        for (char ch : string.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
