package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(-4);
        integerList.add(-100);
        integerList.add(0);
        List<Integer> list = integerList.stream().filter(x -> x > 0).collect(Collectors.toList());
    }
}
