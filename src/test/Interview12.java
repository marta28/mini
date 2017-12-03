package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interview12 {

	public static void main(String[] args) {
		int[] tab = { 3, 5, 1, 2, 4, 5 };
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		//list.add(6);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println(mediana(list));
	
	}

	public static double mediana(List<Integer> list) {

		Comparator<? super Integer> c = null;
		list.sort(null);
		double a = 0;
		double y = 0;
		double b = list.size() / 2;
		int i = (int) b;
		if (a != list.size() % 2) {
			y = list.get(i + 1);
		} else {
			double j = list.get(i);
			double g = list.get(i - 1);
			y = (j + g) / 2;

		}
		return y;
	}

	public static double mediana(int[] tab) {
		Arrays.sort(tab);
		double a = 0;
		double y = 0;
		double b = tab.length / 2;
		int i = (int) b;
		if (a != tab.length % 2) {
			y = tab[i + 1];
		} else {
			double j = tab[i];
			double g = tab[i - 1];
			y = (j + g) / 2;
		}

		return y;

	}
}
