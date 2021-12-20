package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemCompareNameAsc {

    @Test
    public void whenSortByNameItemAsk() {
        List<Item> items = Arrays.asList(
                new Item(1, "Zorro"),
                new Item(2, "Serg"),
                new Item(3, "Anna")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "Anna"),
                new Item(1, "Serg"),
                new Item(2, "Zorro")
        );
        Assert.assertEquals(expected, items);
    }
}

