package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item expected = new Item("Fix PC");
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "edited item"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName(), is("edited item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        Item item1 = new Item("new item1");
        tracker.add(item);
        tracker.add(item1);
        Item deleted = tracker.findById(1);
        String[] answers = {
                String.valueOf(deleted.getId()),
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item findDeleted = tracker.findById(item.getId());
        assertThat(findDeleted, is(nullValue()));
    }
}