package test;

import java.util.HashSet;
import java.util.Set;

public class Interview6 {

	public static void main(String[] args) {

		Set<Integer> z = new HashSet<>();
		z.add(1);
		z.add(2);
		z.add(3);
		z.add(4);
		z.add(5);
		z.add(6);
		z.add(8);

		Set<Integer> b = new HashSet<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		b.add(1);

		
		Set<Integer> c = Testowa.c(b, z);
		
		
		System.out.println(c);
	}

}
