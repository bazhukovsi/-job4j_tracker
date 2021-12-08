package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiapazonFunction {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rezult = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rezult.add(func.apply((double) i));
        }
        return rezult;
    }
}
