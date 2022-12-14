package com.mapreduce.mapreducejava.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.mapreduce.mapreducejava.arrays.FilterImpl.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterTests {

    Integer[] oneThroughSix = {1, 2, 3, 4, 5, 6};
    Integer[] oddNumbers = {1, 3, 5, 7, 9, 11};

    @Test
    @Disabled
    void elementsLessThanFive() {
        var result1 = lessThanFive(oneThroughSix);
        var result2 = lessThanFive(oddNumbers);

        assertThat(result1).isEqualTo(new Integer[]{1, 2, 3, 4});
        assertThat(result2).isEqualTo(new Integer[]{1, 3});
    }

    @Test
    @Disabled
    void evenElements() {
        var result1 = onlyEvenNumbers(oneThroughSix);
        var result2 = onlyEvenNumbers(oddNumbers);

        assertThat(result1).isEqualTo(new Integer[]{2, 4, 6});
        assertThat(result2).isEqualTo(new Integer[]{});
    }

    @Test
    @Disabled
    void oddElements() {
        var result1 = onlyOddNumbers(oneThroughSix);
        var result2 = onlyOddNumbers(oddNumbers);

        assertThat(result1).isEqualTo(new Integer[]{1, 3, 5});
        assertThat(result2).isEqualTo(new Integer[]{1, 3, 5, 7, 9, 11});
    }

    @Test
    @Disabled
    void shorterThanFive() {
        String[] numberWords = {"one", "two", "three", "four"};

        var result = shorterThanFiveCharacters(numberWords);

        assertThat(result).isEqualTo(new String[]{"one", "two", "four"});
    }
}
