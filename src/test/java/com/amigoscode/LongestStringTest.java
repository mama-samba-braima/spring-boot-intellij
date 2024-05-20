package com.amigoscode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LongestStringTest {

    @Test
    public void testFind_WithMultipleStrings_ReturnsLongestString() {
        // Arrange
        LongestString longestString = new LongestString();
        String[] arr = { "a", "abc", "ab" };

        // Act
        String result = longestString.find(arr);

        // Assert
        assertEquals("abc", result);
    }

    @Test
    public void testFind_WithEqualLengthStrings_ReturnsFirstLongestString() {
        // Arrange
        LongestString longestString = new LongestString();
        String[] arr = { "ab", "cd", "ef" };

        // Act
        String result = longestString.find(arr);

        // Assert
        assertEquals("ab", result);
    }

    @Test
    public void testFind_WithSingleString_ReturnsTheSameString() {
        // Arrange
        LongestString longestString = new LongestString();
        String[] arr = { "single" };

        // Act
        String result = longestString.find(arr);

        // Assert
        assertEquals("single", result);
    }

    @Test
    @Disabled
    public void testFind_WithEmptyArray_ReturnsNull() {
        // Arrange
        LongestString longestString = new LongestString();
        String[] arr = {};

        // Act
        String result = longestString.find(arr);

        // Assert
        assertNull(result);
    }
}