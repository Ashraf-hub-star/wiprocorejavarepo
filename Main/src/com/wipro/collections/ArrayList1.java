package com.wipro.collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(100);
		l.add(false);
		l.add(100);
		l.add("Ashraf");
		l.add(null);
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		System.out.println(l.isEmpty());
		
		System.out.println(l.contains(100));
		
		System.out.println(l.indexOf(100));
		
		l.add(3, 35);
		
		System.out.println(l);
		
		l.clear();
		
		System.out.println(l);

	}

}
