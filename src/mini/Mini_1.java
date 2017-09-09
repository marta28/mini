package mini;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mini_1 {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("Danielek");
		lista.add("nie");
		lista.add("ma");
		for (int i = 0; i < 1000000; i++) {
			lista.add("SORENTO");
		}

		Map<String, String> mapa = new HashMap<>();
		mapa.put("Daniel", "Daniel");
		mapa.put("Kupa", "Kupa");

		long start = System.currentTimeMillis();
		System.out.println(count(lista));
		System.out.println(countMap(mapa));
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		System.out.println("JAVA 8");
		start = System.currentTimeMillis();
		System.out.println(countJava8(lista));
		System.out.println(countMapJava8(mapa));
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static Integer count(List<String> lista) {
		int result = 0;
		for (String word : lista) {
			int wordLenght = word.length();
			result += wordLenght;
		}
		return result;
	}

	public static Integer countMap(Map<String, String> mapa) {
		int result = 0;
		for (String key : mapa.keySet()) {
			String word = mapa.get(key);
			int wl = word.length();
			result += wl;
		}
		return result;
	}

	public static Integer countJava8(List<String> lista) {
		return lista.stream().mapToInt(String::length).sum();
	}

	public static Integer countMapJava8(Map<String, String> mapa) {
		return mapa.keySet().stream().map(s -> mapa.get(s)).mapToInt(String::length).sum();
	}

}