package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class maximumTest {
    FindMaximum findMaximum = new FindMaximum();
    @Test
    public void testInteger1() {

        int max = findMaximum.maximumInteger(44,7,11);
        Assert.assertEquals(44,max);

    }

    @Test
    public void testInteger2() {
        int max = findMaximum.maximumInteger(44,74,13);
        Assert.assertEquals(74,max);

    }
    @Test
    public void testInteger3() {
        int max = findMaximum.maximumInteger(44,74,112);
        Assert.assertEquals(112,max);
    }

    @Test
    public void testFloat1() {
        Float max = findMaximum.maximumFloat(6.1f, 2.1f, 1.1f);
        Assert.assertEquals(6.1f,max,0.1);
    }


    @Test
    public void testFloat2() {
        Float max = findMaximum.maximumFloat(1.1f, 8.3f, 1.1f);
        Assert.assertEquals(8.3f,max,0.1);
    }


    @Test
    public void testFloat3() {
        Float max = findMaximum.maximumFloat(6.1f, 2.1f, 13.9f);
        Assert.assertEquals(13.9f,max,0.1);
    }
}
