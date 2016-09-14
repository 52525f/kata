package com.microfocus.kata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeirdCase {
    String toWeirdCase(String s) {
        return Arrays.stream(s.split(" "))
                .map(this::convertWordToWeirdCase)
                .collect(Collectors.joining(" "));
    }

    private String convertWordToWeirdCase(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isUpper = true;
        for (char c : s.toCharArray()) {
            if (isUpper) {
                sb.append(Character.toUpperCase(c));
                isUpper = false;
            } else {
                sb.append(c);
                isUpper = true;
            }
        }
        return sb.toString();
    }
}
