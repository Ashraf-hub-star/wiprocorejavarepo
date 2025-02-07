package com.wipro.collections;

import java.util.Comparator;

// Comparator class to sort students by name
public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStname().compareToIgnoreCase(s2.getStname());
    }
}
