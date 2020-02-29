package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class maximumTest {

    @Test
    public void givenNumbers_WhenProper_ShouldReturnFirstNumber() {
        FindMaximum findMaximum = new FindMaximum(44, 7, 11);
        int max = (int) findMaximum.getMaximum();
        Assert.assertEquals(44, max);

    }

    @Test
    public void givenNumbers_WhenProper_ShouldReturnSecondNumber() {
        FindMaximum findMaximum = new FindMaximum(44, 74, 11,34);
        int max = (int)findMaximum.getMaximum();
        Assert.assertEquals(74, max);

    }

    @Test
    public void givenNumbers_WhenProper_ShouldReturnThirdNumber() {
        FindMaximum findMaximum = new FindMaximum(44, 7,93, 112);
        int max = (int)findMaximum.getMaximum();
        Assert.assertEquals(112, max);
    }

    @Test
    public void givenFloatNumbers_WhenProper_ShouldReturnFirstNumber() {
        FindMaximum findMaximum = new FindMaximum(6.1f, 2.1f,9.1f, 1.1f);
        Float max = (Float) findMaximum.getMaximum();
        Assert.assertEquals(9.1f, max, 0.1);
    }

    @Test
    public void givenFloatNumbers_WhenProper_ShouldReturnSecondNumber() {
        FindMaximum findMaximum = new FindMaximum(1.1f, 8.3f, 1.1f);
        Float max = (Float) findMaximum.getMaximum();
        Assert.assertEquals(8.3f, max, 0.1);
    }

    @Test
    public void givenFloatNumbers_WhenProper_ShouldReturnThirdNumber() {
        FindMaximum findMaximum = new FindMaximum(6.1f, 2.1f, 13.9f);
        Float max = (Float) findMaximum.getMaximum();
        Assert.assertEquals(13.9f, max, 0.1);
    }

    @Test
    public void givenStrings_WhenProper_ShouldReturnFirstString() {
        FindMaximum findMaximum = new FindMaximum("Zebra", "Peach", "mystar","Banana");
        String max = (String) findMaximum.getMaximum();
        Assert.assertEquals("mystar", max);
    }

    @Test
    public void givenStrings_WhenProper_ShouldReturnSecondString() {
        FindMaximum findMaximum = new FindMaximum("Lomesh", "Supriya", "Abhi");
        String max = (String) findMaximum.getMaximum();
        Assert.assertEquals("Supriya", max);
    }

    @Test
    public void givenStrings_WhenProper_ShouldReturnThirdString() {
        FindMaximum findMaximum = new FindMaximum("Bat", "Mobile", "Orange");
        String max = (String) findMaximum.getMaximum();
        Assert.assertEquals("Orange", max);
    }

}