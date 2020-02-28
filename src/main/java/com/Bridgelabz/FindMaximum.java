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

    public float maximumFloat(Float v, Float v1, Float v2) {
        Float max=v;
        if(v1.compareTo(max) > 0 )
            max= v1;
        if(v2.compareTo(max)>0)
            max=v2;
        return max;
    }
}
