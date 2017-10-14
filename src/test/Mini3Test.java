package test;

import org.junit.Assert;
import org.junit.Test;

import mini.Mini_3;

public class Mini3Test {

	@Test
	public void test1() {
		int day = 1;
		int month = 1;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test2() {
		int day = 1;
		int month = 12;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test3() {
		int day = 31;
		int month = 1;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test4() {
		int day = 28;
		int month = 2;
		int year = 2001;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test5() {
		int day = 31;
		int month = 3;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test6() {
		int day = 30;
		int month = 4;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test7() {
		int day = 31;
		int month = 5;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test8() {
		int day = 30;
		int month = 6;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test9() {
		int day = 31;
		int month = 7;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test10() {
		int day = 31;
		int month = 8;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test11() {
		int day = 30;
		int month = 9;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test12() {
		int day = 31;
		int month = 10;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test13() {
		int day = 30;
		int month = 11;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test14() {
		int day = 31;
		int month = 12;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test15() {
		int day = 29;
		int month = 2;
		int year = 1992;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test16() {
		int day = 29;
		int month = 2;
		int year = 1996;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test17() {
		int day = 29;
		int month = 2;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test18() {
		int day = 29;
		int month = 2;
		int year = 2004;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test19() {
		int day = 29;
		int month = 2;
		int year = 2008;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test20() {
		int day = 29;
		int month = 2;
		int year = 2012;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test21() {
		int day = 29;
		int month = 2;
		int year = 2016;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test22() {
		int day = 29;
		int month = 2;
		int year = 2020;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test23() {
		int day = 29;
		int month = 2;
		int year = 2024;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test24() {
		int day = 28;
		int month = 2;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertTrue(validDate);
	}

	@Test
	public void test25() {
		int day = 111;
		int month = 1;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test26() {
		int day = 32;
		int month = 1;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test27() {
		int day = 30;
		int month = 2;
		int year = 2000;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test28() {
		int day = 29;
		int month = 2;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test29() {
		int day = 29;
		int month = 2;
		int year = 2018;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test30() {
		int day = 29;
		int month = 2;
		int year = 2019;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test31() {
		int day = 32;
		int month = 3;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test32() {
		int day = 31;
		int month = 4;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test33() {
		int day = 32;
		int month = 5;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test34() {
		int day = 31;
		int month = 6;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test35() {
		int day = 32;
		int month = 7;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test36() {
		int day = 32;
		int month = 8;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test37() {
		int day = 31;
		int month = 9;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test38() {
		int day = 32;
		int month = 10;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test39() {
		int day = 31;
		int month = 11;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test40() {
		int day = 32;
		int month = 12;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test41() {
		int day = 14;
		int month = 0;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test42() {
		int day = 14;
		int month = 13;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test43() {
		int day = 0;
		int month = 1;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test44() {
		int day = -1;
		int month = 4;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

	@Test
	public void test45() {
		int day = -1;
		int month = -1;
		int year = 2017;
		boolean validDate = Mini_3.check(day, month, year);
		Assert.assertFalse(validDate);
	}

}
