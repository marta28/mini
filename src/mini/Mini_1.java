package mini;

import java.util.ArrayList;
import java.util.List;

public class Mini_1 {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("Danielek");
		lista.add("nie");
		lista.add("ma");
		lista.add("SORENTO");
		Integer i = count(lista);
		System.out.println(i);
	}

	public static Integer count(List<String> lista) {
		int result=0;
		for (String word : lista) {
			int wordLenght = word.length();
			 result += wordLenght;
		}
		return result;


		
	}
}
