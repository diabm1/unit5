package com.devmountain.unit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BalancedBracketsTest {
    @Test
    void testBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedParentheses("((()))"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[()]}"));
        assertFalse(BalancedBrackets.hasBalancedParentheses("((())("));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[()]"));

        // Additional test cases
        assertTrue(BalancedBrackets.hasBalancedParentheses(""));
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertFalse(BalancedBrackets.hasBalancedParentheses(")"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertFalse(BalancedBrackets.hasBalancedParentheses(")("));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{(})"));
    }
}

