package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class IntMatrixToListTest {

    @Test
    public void convertIntToList() {
        List<List<Integer>> test = List.of(
                List.of(1, 2),
                List.of(3, 4));
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> rsl = IntMatrixToList.convert(test);
        assertThat(rsl, is(expected));
    }
}