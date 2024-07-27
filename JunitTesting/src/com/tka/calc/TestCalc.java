package com.tka.calc;

import org.junit.Test;

import junit.framework.Assert;

public class TestCalc {

	@Test
	public void test() {
		Assert.assertEquals(18, Calculator.add(3, 15));

	}
	
	@Test
	public void test1() {
	
		Assert.assertEquals(10, Calculator.diff(25, 15));

	}
	
	@Test
	public void test2() {
	
		Assert.assertEquals(45, Calculator.mul(3, 15));

	}
	
	@Test
	public void test3() {

		Assert.assertEquals(3, Calculator.div(45, 15));
	}

}
