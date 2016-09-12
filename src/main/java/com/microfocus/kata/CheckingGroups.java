package com.microfocus.kata;

import java.util.Deque;
import java.util.LinkedList;

public class CheckingGroups {
    public static boolean groupCheck(String s) {
        Deque<Character> tokenStack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (isLeftSymbol(c)) {
                tokenStack.push(c);
            } else if (isRightSymbol(c) && noMatchingLeftSymbol(tokenStack, c)) {
                return false;
            }
        }
        return tokenStack.isEmpty();
    }

    private static boolean noMatchingLeftSymbol(Deque<Character> tokenStack, char c) {
        return tokenStack.isEmpty() || !isMatch(tokenStack.pop(), c);
    }

    private static boolean isRightSymbol(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private static boolean isLeftSymbol(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static boolean isMatch(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }
}
