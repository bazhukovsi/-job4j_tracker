package ru.job4j.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(subject -> subject.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0.0);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(tp -> new Tuple(tp.getName(),
                        tp.getSubjects().stream()
                                .mapToInt(Subject::getScore)
                                .average()
                                .orElse(0)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(sub -> sub.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName, LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(mp -> new Tuple(mp.getKey(), mp.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(tp -> new Tuple(tp.getName(),
                tp.getSubjects().stream()
                        .mapToInt(Subject::getScore)
                        .sum())).max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(sub -> sub.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName, Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(mp -> new Tuple(mp.getKey(), mp.getValue()))
                .max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }
}
