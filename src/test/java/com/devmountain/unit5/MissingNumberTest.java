package com.devmountain.unit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    @Test
    void testMissingNumber() {
        assertEquals(8, MissingNumber.findMissingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10));
        assertEquals(0, MissingNumber.findMissingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));

        // Additional test cases
        assertEquals(3, MissingNumber.findMissingNumber(new int[]{1, 2, 4, 5}, 5));
        assertEquals(0, MissingNumber.findMissingNumber(new int[]{}, 0));
        assertEquals(1, MissingNumber.findMissingNumber(new int[]{2, 3, 4}, 4));
    }
}

