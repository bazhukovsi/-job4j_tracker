package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new Job.JobDescByName().thenComparing(new Job.JobDescByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new Job.JobDescByPriority().thenComparing(new Job.JobDescByName()));
        System.out.println(jobs);
        Collections.sort(jobs, new Job.JobAscByName().thenComparing(new Job.JobAscByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new Job.JobAscByPriority().thenComparing(new Job.JobAscByName()));
        System.out.println(jobs);
    }
}
