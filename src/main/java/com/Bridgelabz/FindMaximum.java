package com.Bridgelabz;

public class FindMaximum {


    public int maximumInteger(Integer i, Integer i1, Integer i2) {
        Integer max=i;
        if(i1.compareTo(max) > 0 )
            max= i1;
        if(i2.compareTo(max)>0)
            max=i2;
        return max;
    }
}
