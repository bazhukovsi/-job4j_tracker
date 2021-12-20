package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemCompareNameDesc {

    @Test
    public void whenSortByNameItemDesc() {
        List<Item> items = Arrays.asList(
                new Item(1, "Serg"),
                new Item(2, "Zorro"),
                new Item(3, "Anna")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Zorro"),
                new Item(1, "Serg"),
                new Item(3, "Anna")
        );
        Assert.assertEquals(expected, items);
    }
}
