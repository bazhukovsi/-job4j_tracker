package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenCompatorByNameAsc() {
        Comparator<Job> cmpName = new Job.JobAscByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameDesc() {
        Comparator<Job> cmpName = new Job.JobDescByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityAsc() {
        Comparator<Job> cmpPriority = new Job.JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityDesc() {
        Comparator<Job> cmpNamePriority = new Job.JobDescByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDesc() {
        Comparator<Job> cmpNamePriority = new Job.JobDescByName().thenComparing(new Job.JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityAsc() {
        Comparator<Job> cmpNamePriority = new Job.JobAscByName().thenComparing(new Job.JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityAndNameDesc() {
        Comparator<Job> cmpPriorityName = new Job.JobDescByPriority().thenComparing(new Job.JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityAndNameAsc() {
        Comparator<Job> cmpPriorityName = new Job.JobAscByPriority().thenComparing(new Job.JobAscByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

}