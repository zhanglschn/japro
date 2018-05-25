package com.ju.japro.structalg.eleven.holding;

import static com.ju.japro.common.util.Print.print;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

@SuppressWarnings("all")
public class PrintingContiners {
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}

	static Map fill(Map<String, String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");

		return map;
	}
	
	public static void main(String[] args) {
		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		print(fill(new HashSet<String>()));
		print(fill(new TreeSet<String>()));
		print(fill(new LinkedHashSet<String>()));
		print(fill(new HashMap<String,String>()));
		print(fill(new LinkedHashMap<String,String>()));
	}
}