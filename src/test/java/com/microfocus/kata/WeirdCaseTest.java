package com.microfocus.kata;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WeirdCaseTest {
    @Test
    public void handlesSingleWord() throws Exception {
        WeirdCase weirdCase = new WeirdCase();
        assertEquals(weirdCase.toWeirdCase("This"), "ThIs");
    }

    @Test
    public void handlesMultipleWords() throws Exception {
        WeirdCase weirdCase = new WeirdCase();
        assertEquals(weirdCase.toWeirdCase("This is a test"), "ThIs Is A TeSt");
    }
}
