package com.mapreduce.mapreducejava.lists;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.mapreduce.mapreducejava.lists.FilterImpl.*;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterTests {

    List<Integer> oneThroughSix = asList(1, 2, 3, 4, 5, 6);
    List<Integer> oddNumbers = asList(1, 3, 5, 7, 9, 11);

    @Test
    @Disabled
    void elementsLessThanFive() {
        var result1 = lessThanFive(oneThroughSix);
        var result2 = lessThanFive(oddNumbers);

        assertThat(result1).isEqualTo(asList(1, 2, 3, 4));
        assertThat(result2).isEqualTo(asList(1, 3));
    }

    @Test
    @Disabled
    void evenElements() {
        var result1 = onlyEvenNumbers(oneThroughSix);
        var result2 = onlyEvenNumbers(oddNumbers);

        assertThat(result1).isEqualTo(asList(2, 4, 6));
        assertThat(result2).isEqualTo(emptyList());
    }

    @Test
    @Disabled
    void oddElements() {
        var result1 = onlyOddNumbers(oneThroughSix);
        var result2 = onlyOddNumbers(oddNumbers);

        assertThat(result1).isEqualTo(asList(1, 3, 5));
        assertThat(result2).isEqualTo(asList(1, 3, 5, 7, 9, 11));
    }

    @Test
    @Disabled
    void shorterThanFive() {
        List<String> numberWords = asList("one", "two", "three", "four");

        var result = shorterThanFiveCharacters(numberWords);

        assertThat(result).isEqualTo(asList("one", "two", "four"));
    }
}
