package leetcode;

import java.util.Stack;

class Task0020Easy {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (type(c) < 0) {
                if (type(c) + type(stack.peek()) == 0) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public int type(char c) {
        switch (c) {
            case '(':
                return 1;
            case '[':
                return 2;
            case '{':
                return 3;
            case '}':
                return -3;
            case ']':
                return -2;
            case ')':
                return -1;
            default:
                return 0;
        }
    }
}
