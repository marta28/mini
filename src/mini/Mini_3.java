package mini;

import java.util.Scanner;

public class Mini_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println(check(a, b, c));

	}

	public static boolean check(int a, int b, int c) {

		if (c % 4 != 0 && b != 2 && a != 29) {
			return false;
		}
		if (c % 4 != 0 && b == 2 && a != 28) {
			return false;
		}
		if (((b != 2 && b % 2 == 0) && a < 30) || b > 12) {

			return false;
		}
		if (a > 31 || a < 0) {
			return false;
		}

		return true;
	}

}
