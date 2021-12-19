package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void compareToUserByNameIfEqualsThenAge() {
        List<User> users = Arrays.asList(
                new User("Anna", 55),
                new User("Anna", 10),
                new User("Serg", 55)
        );
        Collections.sort(users);
        List<User> expected = Arrays.asList(
                new User("Anna", 10),
                new User("Anna", 55),
                new User("Serg", 55)
        );
        Assert.assertEquals(expected, users);
    }
}