package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ItemCompareNameAsc {

        @Test
        public void whenSortByNameItemAsk() {
            List<Item> items = Arrays.asList(
                    new Item(1, "Zorro"),
                    new Item(2, "Serg"),
                    new Item(3, "Anna")
            );
            Collections.sort(items, new Item.ItemAscByName());
            assertThat(items.get(0).getName(), is("Anna"));
        }
    }

