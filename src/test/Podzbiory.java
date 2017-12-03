package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Podzbiory {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3 };
		Integer[] arr2 = { 2, 3, 4, 5 };
		Result result = splitArrays(arr1, arr2);
		System.out.println(Arrays.toString(result.getFirst()));
		System.out.println(Arrays.toString(result.getBoth()));
		System.out.println(Arrays.toString(result.getSecond()));

	}

	public static Result splitArrays(Integer[] arr1, Integer[] arr2) {

		List<Integer> list1 = Arrays.stream(arr1).collect(Collectors.toList());

		List<Integer> list2 = Arrays.stream(arr2).collect(Collectors.toList());

		List<Integer> first = new LinkedList<Integer>();
		List<Integer> both = new LinkedList<Integer>();
		List<Integer> second = new LinkedList<Integer>();

		for (Integer element : list1) {
			if (list2.contains(element)) {
				both.add(element);
			} else {
				first.add(element);
			}

		}
		for (Integer element : list2) {
			if (!list1.contains(element)) {
				second.add(element);
			}
		}

		Result result = new Result();
		result.setFirst(first.toArray(new Integer[first.size()]));
		result.setBoth(both.toArray(new Integer[both.size()]));
		result.setSecond(second.toArray(new Integer[second.size()]));
		return result;
	}

}
