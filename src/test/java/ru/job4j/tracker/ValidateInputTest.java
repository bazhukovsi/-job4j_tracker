package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));

    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
    }

    @Test
    public void whenThreeValidInput() {
        Output out = new StubOutput();
        String[] str = new String[]{"1", "2", "3"};
        Input in = new StubInput(str);
        ValidateInput input = new ValidateInput(out, in);
        int[] selected = new int[str.length];
        selected[0] = input.askInt("Enter menu:");
        selected[1] = input.askInt("Enter menu:");
        selected[2] = input.askInt("Enter menu:");
        assertThat(selected[0], is(Integer.parseInt(str[0])));
        assertThat(selected[1], is(Integer.parseInt(str[1])));
        assertThat(selected[2], is(Integer.parseInt(str[2])));
    }

    @Test
    public void whenNegativeInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-10"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-10));
    }

}