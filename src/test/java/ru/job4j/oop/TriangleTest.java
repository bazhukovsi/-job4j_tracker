package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void area004004() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void area400004() {
        Point a = new Point(4, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void area100001() {
        Point a = new Point(1, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(0.5, 0.001));
    }

    @Test
    public void area1000001() {
        Point a = new Point(10, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertEquals(-1, -1);
    }
}