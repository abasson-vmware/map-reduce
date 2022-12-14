package com.mapreduce.mapreducejava.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.mapreduce.mapreducejava.arrays.MapImpl.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MapTests {

    Integer[] oneThroughSix = {1, 2, 3, 4, 5, 6};
    Integer[] oddNumbers = {1, 3, 5, 7, 9, 11};

    @Test
    @Disabled
    void doubleEachElementInTheArray() {
        var result1 = doubleEachElement(oneThroughSix);
        var result2 = doubleEachElement(oddNumbers);

        assertThat(result1).isEqualTo(new Integer[]{2, 4, 6, 8, 10, 12});
        assertThat(result2).isEqualTo(new Integer[]{2, 6, 10, 14, 18, 22});
    }

    @Test
    @Disabled
    void squareEachElementInTheArray() {
        var result1 = squareEachElement(oneThroughSix);
        var result2 = squareEachElement(oddNumbers);

        assertThat(result1).isEqualTo(new Integer[]{1, 4, 9, 16, 25, 36});
        assertThat(result2).isEqualTo(new Integer[]{1, 9, 25, 49, 81, 121});
    }

    @Test
    @Disabled
    void addTwoToEachElementInTheArray() {
        var result1 = addTwoToEachElement(oneThroughSix);
        var result2 = addTwoToEachElement(oddNumbers);

        assertThat(result1).isEqualTo(new Integer[]{3, 4, 5, 6, 7, 8});
        assertThat(result2).isEqualTo(new Integer[]{3, 5, 7, 9, 11, 13});
    }

    @Test
    @Disabled
    void capitalize() {
        String[] numberWords = {"one", "two", "three", "four"};

        var result = capitalizeEachElement(numberWords);

        assertThat(result).isEqualTo(new String[]{"One", "Two", "Three", "Four"});
    }
}
