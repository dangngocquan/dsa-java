package other.collections.math;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Expression {
    public static List<String> expressionToInfix(String expression) {
        List<String> list = new LinkedList<>();
        String currentNumber = "";
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c >= '0' && c <= '9') {
                currentNumber += c;
            } else {
                if (currentNumber.length() > 0) {
                    list.add(currentNumber);
                    currentNumber = "";
                }
                list.add(c + "");
            }
        }
        if (currentNumber.length() > 0) list.add(currentNumber);
        return list;
    }

    public static int getPriority(String operation) {
        if (operation.equals("*") || operation.equals("/")) {
            return 2;
        } else if (operation.equals("+") || operation.equals("-")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static List<String> infixToPostfix(List<String> infix) {
        List<String> postfix = new LinkedList<>();
        Stack<String> stackOperation = new Stack<String>();
        for (String token : infix) {
            if (token.matches("[0-9]{1,}")) {
                postfix.add(token);
            } else {
                if (token.equals(")")) {
                    while (!stackOperation.peek().equals("(")) {
                        postfix.add(stackOperation.pop());
                    }
                    stackOperation.pop();
                } else if (stackOperation.size() == 0 || token.equals("(")) {
                    stackOperation.push(token);
                } else {
                    int currentPriorityOperation = getPriority(token);
                    int topPriorityOperation = getPriority(stackOperation.peek());
                    while (topPriorityOperation >= currentPriorityOperation) {
                        postfix.add(stackOperation.pop());
                        if (stackOperation.size() == 0) {
                            topPriorityOperation = 0;
                        } else {
                            topPriorityOperation = getPriority(stackOperation.peek());
                        }
                    }
                    stackOperation.push(token);
                }

            }
        }
        while (!stackOperation.isEmpty()) {
            postfix.add(stackOperation.pop());
        }
        return postfix;
    }

    public static long evaluate(List<String> postfix) {
        Stack<String> stack = new Stack<>();
        for (String token : postfix) {
            if (token.matches("[0-9]{1,}")) {
                stack.push(token);
            } else {
                long number2 = Long.parseLong(stack.pop());
                long number1 = Long.parseLong(stack.pop());
                long number = 0;
                switch (token) {
                    case "+":
                        number = number1 + number2;
                        break;
                    case "-":
                        number = number1 - number2;
                        break;
                    case "*":
                        number = number1 * number2;
                        break;
                    case "/":
                        number = number1 / number2;
                        break;
                    default:
                        break;
                }
                stack.push(number + "");
            }
        }
        return Long.parseLong(stack.pop());
    }
}
