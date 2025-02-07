package com.wipro.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceEx {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Ashraf");
		map.put(2, "Shaik");
		map.put(1, "Ashraf");
		map.put(3, "UPD");
		map.put(4, "BTech");
		map.put(null, null);
		
		System.out.println(map);

	}

}
