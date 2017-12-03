package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Interview10 {

	private String removeDuplicates(String text) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			if (i == text.length() - 1 || text.charAt(i) != text.charAt(i + 1)) {
				result += text.charAt(i);
			}
		}
		return result;
	}

	@Test
	public void test1() {
		String result = removeDuplicates("martaa");
		assertEquals("marta", result);

	}

	@Test
	public void test2() {
		String result = removeDuplicates("daaniell");
		assertEquals("daniel", result);
	}

	@Test
	public void test3() {
		String result = removeDuplicates("ddddanieeeelllass");
		assertEquals("danielas", result);
	}

	@Test
	public void test4() {
		String result = removeDuplicates("daniel");
		assertEquals("daniel", result);
	}
	@Test
	public void test5(){
		String result  = removeDuplicates("");
		assertEquals("", result);
	}
	@Test
	public void test6(){
		String result = removeDuplicates("aaabbb");
		assertEquals("ab", result);
	}
	@Test
	public void test7(){
		String result = removeDuplicates("aaabbcbbbb");
		assertEquals("abcb", result);
	}
}
