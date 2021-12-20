package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return Integer.compare(Integer.parseInt(left.split(" ")[0].substring(0, left.split(" ")[0].length() - 1)),
                Integer.parseInt(right.split(" ")[0].substring(0, right.split(" ")[0].length() - 1)));
    }
}
