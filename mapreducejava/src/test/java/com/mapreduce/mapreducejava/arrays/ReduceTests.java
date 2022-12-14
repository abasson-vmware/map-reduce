package com.mapreduce.mapreducejava.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.mapreduce.mapreducejava.arrays.ReduceImpl.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ReduceTests {

    Integer[] oneThroughSix = {1, 2, 3, 4, 5, 6};
    Integer[] oddNumbers = {1, 3, 5, 7, 9, 11};

    @Test
    @Disabled
    void addTheNumbers() {
        var result1 = sum(oneThroughSix);
        var result2 = sum(oddNumbers);

        assertThat(result1).isEqualTo(1 + 2 + 3 + 4 + 5 + 6);
        assertThat(result2).isEqualTo(1 + 3 + 5 + 7 + 9 + 11);
    }

    @Test
    @Disabled
    void multiplyTheNumbers() {
        var result1 = product(oneThroughSix);
        var result2 = product(oddNumbers);

        assertThat(result1).isEqualTo(2 * 3 * 4 * 5 * 6);
        assertThat(result2).isEqualTo(3 * 5 * 7 * 9 * 11);
    }

    @Test
    @Disabled
    void joinTheWords() {
        String[] numberWords = {"one", "two", "three", "four"};

        var result = join(numberWords);

        assertThat(result).isEqualTo("onetwothreefour");
    }
}
