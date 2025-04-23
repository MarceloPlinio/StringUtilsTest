package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testNormalString() {
        String result = StringUtils.reverse("casa");
        assertEquals("asac", result);
    }

    @Test
    public void testEmptyString() {
        String result = StringUtils.reverse("");
        assertEquals("", result);
    }

    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> {
            StringUtils.reverse(null);
        });
    }

    @Test
    public void testPalindromeString() {
        String result = StringUtils.reverse("ovo");
        assertEquals("ovo", result);
    }
}
