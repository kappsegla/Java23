package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {

    @Test
    void sumOf2And2ShouldBe4() {
        //arrange
        //act
        int actual = Utils.sum(2, 2);
        //assert
        assertEquals(4, actual,"Sum of 2 + 2 should be 4");
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

    @Test
    @DisplayName("🎈 Retrieves a list of names including Kalle and starting with Martin")
    void listOfNamesShouldContainKalle() {
        assertThat(Utils.listOfNames())
                .as("Should be [Martin, Kalle]")
                .contains("Kalle")
                .startsWith("Martin")
                .doesNotContain("Anna");
    }

}
