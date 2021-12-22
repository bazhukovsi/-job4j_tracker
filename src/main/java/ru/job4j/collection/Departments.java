package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> temp = new LinkedHashSet<>();
        for (String dep : deps) {
            StringBuilder result = new StringBuilder();
            for (String depTemp : dep.split("/")) {
                result.append(depTemp).append("/");
                temp.add(result.substring(0, result.length() - 1));
            }
        }
        return new ArrayList<>(temp);
    }

    public static void sortAsc(List<String> orgs) {
        List<String> asc = Departments.fillGaps(orgs);
        Collections.sort(asc);
        System.out.println(asc);
    }

    public static void sortDesc(List<String> orgs) {
        List<String> desc = Departments.fillGaps(orgs);
        Collections.sort(desc, new DepDescComp());
        System.out.println(desc);
    }

    public static class DepDescComp implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String[] left = o1.split("/");
            String[] right = o2.split("/");
            int rsl = right[0].compareTo(left[0]);
            return rsl == 0 ? o1.compareTo(o2) : rsl;
        }
    }

    public static void main(String[] args) {
        List<String> deps = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> finalDeps = fillGaps(deps);
        sortAsc(finalDeps);
        System.out.println("---------");
        sortDesc(finalDeps);
    }
}
