package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Interview11 {

	private Map<String, Integer> metoda(List<String> list) {

		Map<String, Integer> map = new HashMap<>();
		for (String word : list) {
			map.put(word, word.length());
		}

		return map;

	}

	@Test
	public void test() {
		List<String> list = new ArrayList<>();
		list.add("ala");
		list.add("danielas");
		Map<String, Integer> result = metoda(list);
		Map<String, Integer> map = new HashMap<>();
		map.put("ala", 3);
		map.put("danielas", 8);
		assertEquals(map, result);
	}

	@Test
	public void test1() {
		List<String> list = new ArrayList<>();
		Map<String, Integer> result = metoda(list);
		Map<String, Integer> map = new HashMap<>();
		assertEquals(map, result);

	}

	@Test
	public void test2() {
		List<String> list = new ArrayList<>();
		list.add("ala");
		list.add("ala");
		Map<String, Integer> result = metoda(list);
		Map<String, Integer> map = new HashMap<>();
		map.put("ala", 3);
		map.put("ala", 3);
		System.out.println(map);
		assertEquals(map, result);
	}
}
