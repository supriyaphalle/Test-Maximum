package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class FindMaximum <E extends Comparable <E>> {

    public ArrayList<E> arrayList;

    public FindMaximum(E... elements) {
        arrayList = new ArrayList<>();
        for (E i : elements)
            arrayList.add(i);

    }



    public E getMaximum() {
        System.out.println(arrayList);
        E result = (E) getMaximum(arrayList);
        return result;
    }

    public static <E extends Comparable<E>> E getMaximum(ArrayList<E> arraylist) {
        E max = arraylist.get(0);
        for(int i = 1; i <arraylist.size(); i++ ) {
            if (arraylist.get(i).compareTo(max) > 0) {
                max = arraylist.get(i);
            }
        }
        return max;
    }
}