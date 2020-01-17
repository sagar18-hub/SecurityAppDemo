/**
 * 
 */
package com.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adms.java1
 *
 */
public class HashMapIterators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("web", 1024);
		map.put("database", 2048);
		map.put("static", 5120);

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
		/*
		 * for (Map.Entry<String, Integer> entry : map.entrySet())
		 * 
		 * System.out.println("Value to be displayed :" + entry.getKey() +
		 * " [Value] : " + entry.getValue());
		 */

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("[Key] : " + entry.getKey() + " [Value] : "
					+ entry.getValue());
		}

		map.forEach((key, value) -> System.out.println("[Key] : " + key
				+ " [Value] : " + value));

	}

}
