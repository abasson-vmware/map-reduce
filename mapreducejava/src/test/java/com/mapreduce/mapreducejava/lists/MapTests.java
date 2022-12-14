package com.mapreduce.mapreducejava.lists;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.mapreduce.mapreducejava.lists.MapImpl.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class MapTests {

    List<Integer> oneThroughSix = asList(1, 2, 3, 4, 5, 6);
    List<Integer> oddNumbers = asList(1, 3, 5, 7, 9, 11);

    @Test
//    @Disabled
    void doubleEachElementInTheList() {
        var result1 = doubleEachElement(oneThroughSix);
        var result2 = doubleEachElement(oddNumbers);

        assertThat(result1).isEqualTo(asList(2, 4, 6, 8, 10, 12));
        assertThat(result2).isEqualTo(asList(2, 6, 10, 14, 18, 22));
    }

    @Test
    @Disabled
    void squareEachElementInTheList() {
        var result1 = squareEachElement(oneThroughSix);
        var result2 = squareEachElement(oddNumbers);

        assertThat(result1).isEqualTo(asList(1, 4, 9, 16, 25, 36));
        assertThat(result2).isEqualTo(asList(1, 9, 25, 49, 81, 121));
    }

    @Test
    @Disabled
    void addTwoToEachElementInTheList() {
        var result1 = addTwoToEachElement(oneThroughSix);
        var result2 = addTwoToEachElement(oddNumbers);

        assertThat(result1).isEqualTo(asList(3, 4, 5, 6, 7, 8));
        assertThat(result2).isEqualTo(asList(3, 5, 7, 9, 11, 13));
    }

    @Test
    @Disabled
    void capitalize() {
        List<String> numberWords = asList("one", "two", "three", "four");

        var result = capitalizeEachElement(numberWords);

        assertThat(result).isEqualTo(asList("One", "Two", "Three", "Four"));
    }
}
