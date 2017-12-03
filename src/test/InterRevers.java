package test;

public class InterRevers {

	public static void main(String[] args) {

		System.out.println(reverse("adam"));
		String a = "marta";

		String c = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			char b = a.charAt(i);
			c = c + b;
		}
		System.out.println(c);
	}

	public static String reverse(String a){
		if(a.length()==1){
			return a;
		}
		char b = a.charAt(0);
		
		String c = reverse(a.substring(1));
		return c+b;
		
	}
	
	
	
	
	
	
}
