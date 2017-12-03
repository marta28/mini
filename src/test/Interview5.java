package test;

import java.util.ArrayList;
import java.util.List;

public class Interview5 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("marta");
		lista.add("marta");
		lista.add("mama");
		lista.add("pies");
		lista.add("dom");
		lista.add("pies");

		List<String> lista2 = new ArrayList<>();

		for (int i = 0; i < lista.size(); i++) {
			if (!lista2.contains(lista.get(i))) {
				lista2.add(lista.get(i));
			}
		}
		System.out.println(lista2);

	}
}
