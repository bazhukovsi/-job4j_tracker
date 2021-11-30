package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double result = point1.distance(point2);
        double expected = 2.00;
        Assert.assertEquals(expected, 2.00, 0.001);

    }

    @Test
    public void distance3dDot83() {
        Point point1 = new Point(0, 0, 1);
        Point point2 = new Point(2, 0, 3);
        double result = point1.distance3d(point2);
        double expected = 1.83;
        Assert.assertEquals(expected, 1.83, 0.001);
    }
}