package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class maximumTest {
    FindMaximum findMaximum = new FindMaximum();

    @Test
    public void givenMaxNumber_AtFirst_WhenProper_ShouldReturnTrue() {

        int max = findMaximum.maximumInteger(44, 7, 11);
        Assert.assertEquals(44, max);

    }

    @Test
    public void givenMaxNumber_AtSecond_WhenProper_ShouldReturnTrue() {
        int max = findMaximum.maximumInteger(44, 74, 13);
        Assert.assertEquals(74, max);

    }

    @Test
    public void givenMaxNumber_AtThird_WhenProper_ShouldReturnTrue() {
        int max = findMaximum.maximumInteger(44, 74, 112);
        Assert.assertEquals(112, max);
    }

    @Test
    public void givenMaxFloatNumber_AtFirst_WhenProper_ShouldReturnTrue() {
        Float max = findMaximum.maximumFloat(6.1f, 2.1f, 1.1f);
        Assert.assertEquals(6.1f, max, 0.1);
    }

    @Test
    public void givenMaxFloatNumber_AtSecond_WhenProper_ShouldReturnTrue() {
        Float max = findMaximum.maximumFloat(1.1f, 8.3f, 1.1f);
        Assert.assertEquals(8.3f, max, 0.1);
    }

    @Test
    public void givenMaxFloatNumber_AtThird_WhenProper_ShouldReturnTrue() {
        Float max = findMaximum.maximumFloat(6.1f, 2.1f, 13.9f);
        Assert.assertEquals(13.9f, max, 0.1);
    }

    @Test
    public void givenString_MaximumAtFirst_WhenProper_ShouldReturnTrue() {
        String max = findMaximum.maximumString("Zebra", "Peach", "Banana");
        Assert.assertEquals("Zebra", max);
    }

    @Test
    public void givenString_MaximumAtSecond_WhenProper_ShouldReturnTrue() {
        String max = findMaximum.maximumString("Lomesh", "Supriya", "Abhi");
        Assert.assertEquals("Supriya", max);
    }

    @Test
    public void givenString_MaximumAtThird_WhenProper_ShouldReturnTrue() {
        String max = findMaximum.maximumString("Bat", "Mobile", "Orange");
        Assert.assertEquals("Orange", max);
    }



}