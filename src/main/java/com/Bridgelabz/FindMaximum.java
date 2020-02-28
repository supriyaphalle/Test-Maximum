package com.Bridgelabz;

public class FindMaximum <E extends Comparable <E>> {
 E a;
 E b;
 E c;

    public FindMaximum(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  E getMaximum(){
        E result= getMaximum(a,b,c);
        return result;
    }

    public static  <E extends Comparable<E>> E getMaximum (E a, E b, E c){
        E max=a;
        if(b.compareTo(max) > 0 )
            max = b;
        if(c.compareTo(max) > 0)
            max=c;
        return max;
    }

}
