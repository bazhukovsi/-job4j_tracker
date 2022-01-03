package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
    }

    @Test
    public void whenThreeValidInput() {
        Output out = new StubOutput();
        String[] str = new String[] {"1", "3", "5"};
        Input in = new StubInput(str);
        ValidateInput[] input = {
                new ValidateInput(out, in),
                new ValidateInput(out, in),
                new ValidateInput(out, in)};
        int[] selected = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            selected[i] = input[i].askInt("Enter menu:");
        }
        for (int i = 0; i < selected.length; i++) {
            assertThat(selected[i], is(Integer.parseInt(str[i])));
        }
    }

    @Test
    public void whenNegativeInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-10"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-10));
    }

}