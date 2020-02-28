package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class maximumTest {
    FindMaximum findMaximum = new FindMaximum();

    @Test
    public void givenNumbers_WhenProper_ShouldReturnFirstNumber() {

        int max = findMaximum.getMaximum(44, 7, 11);
        Assert.assertEquals(44, max);

    }

    @Test
    public void givenNumbers_WhenProper_ShouldReturnSecondNumber() {
        int max = findMaximum.getMaximum(44, 74, 13);
        Assert.assertEquals(74, max);

    }

    @Test
    public void givenNumbers_WhenProper_ShouldReturnThirdNumber() {
        int max = findMaximum.getMaximum(44, 74, 112);
        Assert.assertEquals(112, max);
    }

    @Test
    public void givenFloatNumbers_WhenProper_ShouldReturnFirstNumber() {
        Float max = findMaximum.getMaximum(6.1f, 2.1f, 1.1f);
        Assert.assertEquals(6.1f, max, 0.1);
    }

    @Test
    public void givenFloatNumbers_WhenProper_ShouldReturnSecondNumber() {
        Float max = findMaximum.getMaximum(1.1f, 8.3f, 1.1f);
        Assert.assertEquals(8.3f, max, 0.1);
    }

    @Test
    public void givenFloatNumbers_WhenProper_ShouldReturnThirdNumber() {
        Float max = findMaximum.getMaximum(6.1f, 2.1f, 13.9f);
        Assert.assertEquals(13.9f, max, 0.1);
    }

    @Test
    public void givenStrings_WhenProper_ShouldReturnFirstString() {
        String max = findMaximum.getMaximum("Zebra", "Peach", "Banana");
        Assert.assertEquals("Zebra", max);
    }

    @Test
    public void givenStrings_WhenProper_ShouldReturnSecondString() {
        String max = findMaximum.getMaximum("Lomesh", "Supriya", "Abhi");
        Assert.assertEquals("Supriya", max);
    }

    @Test
    public void givenStrings_WhenProper_ShouldReturnThirdString() {
        String max = findMaximum.getMaximum("Bat", "Mobile", "Orange");
        Assert.assertEquals("Orange", max);
    }



}