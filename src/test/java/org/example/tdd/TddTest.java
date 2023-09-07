package org.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TddTest {

    @Test
    void givenEmptyStringThenReturnZero() {
        int answer = Tdd.add("");
        assertEquals(0, answer);
    }

    @Test
    void givenString1ThenReturn1() {
        int answer = Tdd.add("1");
        assertEquals(1, answer);
    }
}
