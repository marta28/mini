package test;

public class Interview2 {

	public static void main(String[] args) {
		int[] tab = { 1, 3, 4, 6 };
		int min = 101;
		int max = -101;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] < min) {
				min = tab[i];
			}
			if(tab[i] > max){
				max = tab[i];
			}
		}
		
		System.out.println(min + " " + max);
	}

}
