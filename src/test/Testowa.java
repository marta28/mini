package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Testowa {
	
	private final static Integer MILIARD = 1000000;

	public static Set<Integer> c(Set<Integer> b, Set<Integer> z) {
		Set<Integer> c = new HashSet<>();

		for (Integer liczba : z) {
			if (b.contains(liczba)) {
				c.add(liczba);
			}
		}
		return c;
	}

	public static List<String> l() {

		List<String> l = new ArrayList<>();

		for (int i = 0; i < MILIARD; i++) {
			l.add(0, "d");
		}

		return l;

	}

	public static List<String> li() {

		List<String> li = new LinkedList<>();

		for (int i = 0; i < MILIARD; i++) {
			li.add(0, "d");

		}
		return li;

	}

}
