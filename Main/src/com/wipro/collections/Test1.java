package com.wipro.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test1 {

    public SortedSet<Integer> createSortedSet() {
        SortedSet<Integer> s = new TreeSet<>();
        s.add(100);
        s.add(6);
        s.add(67);
        s.add(-5);
        s.add(234);
        s.add(333);
        s.add(152);
        return s;
    }
}