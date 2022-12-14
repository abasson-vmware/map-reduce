package com.mapreduce.mapreducejava.lists;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.mapreduce.mapreducejava.lists.ReduceImpl.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ReduceTests {

    List<Integer> oneThroughSix = asList(1, 2, 3, 4, 5, 6);
    List<Integer> oddNumbers = asList(1, 3, 5, 7, 9, 11);

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
        List<String> numberWords = asList("one", "two", "three", "four");

        var result = join(numberWords);

        assertThat(result).isEqualTo("onetwothreefour");
    }
}
