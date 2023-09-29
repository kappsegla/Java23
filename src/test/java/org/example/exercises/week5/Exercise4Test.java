package org.example.exercises.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    @Test
    @DisplayName("should return set of unique words in string")
    void shouldReturnSetOfUniqueWordsInString() {
        String testString = "Hej på dig sa Kalle Hej på dig sa Ada";
        var exercise = new Exercise4();
        var result = exercise.returnsUniqueWords(testString);
        assertThat(result).containsExactlyInAnyOrder("Hej", "på","dig","sa","Kalle","Ada");
    }

}
