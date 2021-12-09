package ru.job4j.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class IntMatrixToList {
public static List<Integer> convert(List<List<Integer>> input) {
    return input.stream()
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
}
}
