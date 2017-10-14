import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview1 {

	public static void main(String[] args) {
		int[] tab = { 1, 2, 4, -6, 9, -6, 3, 5, 4 };
		System.out.println(getMin(tab));
	}

	private static int getMin(int[] tab) {
		List<Integer> list = Arrays.stream(tab).boxed().collect(Collectors.toList());
		for (int i = 1; i < 100000; i++) {
			if (!list.contains(i)) {
				return i;
			}
		}
		return 0;

	}
}
