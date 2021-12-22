package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> temp = new LinkedHashSet<>();
        List<String> rsl = new ArrayList<>();
        for (String dep : deps) {
            String result = "";
            for (String depTemp : dep.split("/")) {
                result = result + depTemp + "/";
                temp.add(result.substring(0, result.length() - 1));
            }
        }
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }

    public static void main(String[] args) {
        List<String> deps = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> finalDeps = fillGaps(deps);
    }
}
