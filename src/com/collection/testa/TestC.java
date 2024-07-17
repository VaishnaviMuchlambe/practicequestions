package com.collection.testa;
//collection->HashMap
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String> ();
		hmap.put(12, "vaishnavi");
		hmap.put(13, "aditya");
		hmap.put(14, "abhi");
		hmap.put(15, "sanika");
		hmap.put(16, "prasad");

		System.out.println(hmap.size());
		hmap.forEach((k,v)-> System.out.println(k +" "+v));
		
		Set<Integer>set = hmap.keySet();
		for(Integer z:  set) {
			System.out.println(z);
		}
		Collection<String> c = hmap.values();
		for(String t: c ) {
			System.out.println(t);
			}
		Set<Entry<Integer ,String>> kk = hmap.entrySet();
		for(Entry<Integer ,String>entry:kk) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
