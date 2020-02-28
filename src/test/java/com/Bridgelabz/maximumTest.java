package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class maximumTest {
    @Test
    public void testInteger1() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maximumInteger(44,7,11);
        Assert.assertEquals(44,max);

    }

    @Test
    public void testInteger2() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maximumInteger(44,74,13);
        Assert.assertEquals(74,max);

    }
    @Test
    public void testInteger3() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maximumInteger(44,74,112);
        Assert.assertEquals(112,max);
    }




}
