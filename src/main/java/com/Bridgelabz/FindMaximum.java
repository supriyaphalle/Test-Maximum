package com.Bridgelabz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class FindMaximum <E extends Comparable <E>> {
    private ArrayList<E> arrayList;
    public FindMaximum(E... elements) {
        arrayList = new ArrayList<>();
        for (E i : elements)
            arrayList.add(i);
    }

    public <E extends Comparable<E>> E getMaximum() {
        System.out.println(arrayList);
        E result = (E) getMaximum(arrayList);
        printMax(result);
        return result;
    }

   public static <E extends Comparable<E>> E getMaximum(ArrayList<E> arraylist) {
        E max = arraylist.get(0);
        for (E i:arraylist) {
           if (i.compareTo(max) > 0) {
                max = i;
           }
        }
        return  max;
   }

    private static <E extends Comparable<E>> void printMax(E max) {
        System.out.println("Maximum is " +max);
    }
}