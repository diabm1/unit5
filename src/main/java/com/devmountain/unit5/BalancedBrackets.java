package com.devmountain.unit5;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean hasBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean hasBalancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('{', '}');
        bracketPairs.put('[', ']');
        bracketPairs.put('<', '>');

        for (char ch : str.toCharArray()) {
            if (bracketPairs.containsKey(ch)) {
                stack.push(ch);
            } else if (bracketPairs.containsValue(ch)) {
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != ch) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "((())())"; // Balanced parentheses
        String str2 = "{[()]}"; // Balanced brackets
        String str3 = "((())("; // Unbalanced parentheses
        String str4 = "{[()]"; // Unbalanced brackets

        System.out.println("Has balanced parentheses (str1): " + hasBalancedParentheses(str1));
        System.out.println("Has balanced brackets (str2): " + hasBalancedBrackets(str2));
        System.out.println("Has balanced parentheses (str3): " + hasBalancedParentheses(str3));
        System.out.println("Has balanced brackets (str4): " + hasBalancedBrackets(str4));
    }
}

