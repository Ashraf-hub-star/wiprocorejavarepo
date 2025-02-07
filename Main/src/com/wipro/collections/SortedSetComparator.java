package com.wipro.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student1 {
    int stid;
    String stname;

    public Student1(int stid, String stname) {
        this.stid = stid;
        this.stname = stname;
    }

    @Override
    public String toString() {
        return "Student{stid=" + stid + ", stname='" + stname + "'}";
    }
}

public class SortedSetComparator{
    public static void main(String[] args) {
        // Define a Comparator to sort by stid in descending order
        Comparator<Student1> comparator = (s1, s2) -> Integer.compare(s2.stid, s1.stid);

        // Create a SortedSet with custom Comparator
        SortedSet<Student1> sortedSet = new TreeSet<>(comparator);

        // Add Student objects
        sortedSet.add(new Student1(100, "Shaik"));
        sortedSet.add(new Student1(50, "Ashish"));
        sortedSet.add(new Student1(200, "Pratyush"));
        sortedSet.add(new Student1(150, "Kumar"));

        // Print the SortedSet
        System.out.println("SortedSet: " + sortedSet);
    }
}

