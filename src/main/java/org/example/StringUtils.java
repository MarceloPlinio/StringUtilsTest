package org.example;

public class StringUtils {
    public static String reverse(String text) {
        if (text == null) {
            throw new NullPointerException("Input string cannot be null");
        }
        return new StringBuilder(text).reverse().toString();
    }
}
