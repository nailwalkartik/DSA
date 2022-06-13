import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
    public static void main(String[] args) {
        String expression = "[]";
        Boolean bool = checkBalancedBrackets(expression);
    }
    public static boolean checkBalancedBrackets(String expression) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < expression.length(); i++) {
            char element = expression.charAt(i);

            if(element == '[' || element == '{' || element == '(') {
                stack.push(element);
            }
            if(stack.isEmpty()) {
                return false;
            }
            char check;
            switch(element) {
                case ')':
                    check = stack.pop();
                    if(check != ')') {
                        System.out.println("Unbalanced brackets.");
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check != '}') {
                        System.out.println("Unbalanced brackets");
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check != ']') {
                        System.out.println("Unbalanced brackets.");
                        return false;
                    }
                    break;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Balanced brackets");
            return true;
        }
        System.out.println("Unbalanced stack");
        return false;
    }
}
