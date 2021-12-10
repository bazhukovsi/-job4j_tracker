package ru.job4j.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntMatrixToList {
public static List<Integer> convert(Integer[][] input) {
    return Stream.of(input)
            .flatMap(Arrays::stream)
            .collect(Collectors.toList());
}
}
