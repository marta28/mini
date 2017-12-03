package test;

public class Interview3 {

	public static void main(String[] args) {
		System.out.println(ciag(40));
		System.out.println(ciagRekursja(40));
	}

	private static int ciagRekursja(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		return ciagRekursja(x - 1) + ciagRekursja(x - 2);
	}

	public static int ciag(int x) {

		int a = 0;
		int b = 1;
		int c = 0;
		if (x == 0) {
			return 0;
		}
		if (x == 1) {
			return 1;
		}

		for (int i = 0; i < x - 1; i++) {
			c = a + b;
			a = b;
			b = c;

		}

		return c;

	}

}
