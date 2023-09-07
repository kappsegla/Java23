package org.example.tdd;

import org.junit.jupiter.api.Test;

import static org.example.tdd.Tdd.add;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TddTest {

    @Test
    void givenEmptyStringThenReturnZero() {
        int answer = add("");
        assertEquals(0, answer);
    }

    @Test
    void givenString1ThenReturn1() {
        int answer = add("1");
        assertEquals(1, answer);
    }

    @Test
    void givenStringWithTwoNumbersThenReturnSum() {
        assertEquals(3, add("1,2"));
    }

}
