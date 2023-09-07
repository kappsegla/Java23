package org.example;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {

    @Test
    void sumOf2And2ShouldBe4() {
        //arrange
        //act
        int actual = Utils.sum(2, 2);
        //assert
        assertEquals(4, actual);
    }

    @RepeatedTest(10)
    void currentDate() {
        Clock fixedClock = Clock.fixed(Instant.now(), ZoneId.systemDefault());
        Utils utils = new Utils(fixedClock);
        System.out.println("FirstParallelUnitTest second() end => " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(LocalDateTime.now(fixedClock).format(DateTimeFormatter.ISO_LOCAL_DATE), utils.currentDate());
    }

}
