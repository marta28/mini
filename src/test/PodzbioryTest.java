package test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class PodzbioryTest {

	@Test
	public void test1() {
		Integer[] arr1 = { 1, 2, 3 };
		Integer[] arr2 = { 2, 3, 4, 5 };

		Integer[] first = { 1 };
		Integer[] both = { 2, 3 };
		Integer[] second = { 4, 5 };

		Result result = Podzbiory.splitArrays(arr1, arr2);

		assertTrue(Arrays.equals(first, result.getFirst()));
		assertTrue(Arrays.equals(both, result.getBoth()));
		assertTrue(Arrays.equals(second, result.getSecond()));

	}

	@Test
	public void test2() {
		Integer[] arr1 = { 2, 3 };
		Integer[] arr2 = { 2, 3, 4, 5 };

		Integer[] first = {};
		Integer[] both = { 2, 3 };
		Integer[] second = { 4, 5 };

		Result result = Podzbiory.splitArrays(arr1, arr2);

		assertTrue(Arrays.equals(first, result.getFirst()));
		assertTrue(Arrays.equals(both, result.getBoth()));
		assertTrue(Arrays.equals(second, result.getSecond()));

	}

	@Test
	public void test3() {
		Integer[] arr1 = {};
		Integer[] arr2 = { 2, 3, 4, 5 };

		Integer[] first = {};
		Integer[] both = {};
		Integer[] second = { 2, 3, 4, 5 };

		Result result = Podzbiory.splitArrays(arr1, arr2);

		assertTrue(Arrays.equals(first, result.getFirst()));
		assertTrue(Arrays.equals(both, result.getBoth()));
		assertTrue(Arrays.equals(second, result.getSecond()));

	}

	@Test
	public void test4() {
		Integer[] arr1 = { null, 2, 3 };
		Integer[] arr2 = { 2, 3, 4, 5 };

		Integer[] first = { null };
		Integer[] both = { 2, 3 };
		Integer[] second = { 4, 5 };

		Result result = Podzbiory.splitArrays(arr1, arr2);

		assertTrue(Arrays.equals(first, result.getFirst()));
		assertTrue(Arrays.equals(both, result.getBoth()));
		assertTrue(Arrays.equals(second, result.getSecond()));

	}

	@Test
	public void test5() {
		Integer[] arr1 = {};
		Integer[] arr2 = {};

		Integer[] first = {};
		Integer[] both = {};
		Integer[] second = {};

		Result result = Podzbiory.splitArrays(arr1, arr2);

		assertTrue(Arrays.equals(first, result.getFirst()));
		assertTrue(Arrays.equals(both, result.getBoth()));
		assertTrue(Arrays.equals(second, result.getSecond()));

	}

	@Test
	public void test6() {
		Integer[] arr1 = { 1 };
		Integer[] arr2 = { 1 };

		Integer[] first = {};
		Integer[] both = { 1 };
		Integer[] second = {};

		Result result = Podzbiory.splitArrays(arr1, arr2);

		assertTrue(Arrays.equals(first, result.getFirst()));
		assertTrue(Arrays.equals(both, result.getBoth()));
		assertTrue(Arrays.equals(second, result.getSecond()));

	}

}
