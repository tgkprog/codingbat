package org.moh.academic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Map2 {

	public static void main(String[] args) {
		Map2 app = new Map2();
		app.names1();
		app.names2();
	}

	void names1() {
		Map<String, String> names = new TreeMap<String, String>();
		names.put("Mujeeb", "1");
		names.put("Zia", "2");
		names.put("Sara", "3");
		names.put("Biju", "4");
		names.put("Adnan", "5");
		printMap(names, "Direct Tree map");

	}

	void printMap(Map map, String msg) {
		System.out.println(msg);
		Set namesSet = map.keySet();
		// Set namesSet;
		Iterator namesIterate = namesSet.iterator();
		while (namesIterate.hasNext()) {
			Object o = namesIterate.next();
			System.out.println("Key " + o + ":" + map.get(o));
		}
		System.out.println("");
	}

	void names2() {
		Map<String, String> names = new HashMap<String, String>();
		names.put("Mujeeb", "1");
		names.put("Zia", "2");
		names.put("Sara", "3");
		names.put("Biju", "4");
		names.put("Adnan", "5");
		printMap(names, "hashmap");

		Map<String, String> names2 = new TreeMap<String, String>();
		names2.putAll(names);
		printMap(names2, "Names 2 Treemap");
	}

}
