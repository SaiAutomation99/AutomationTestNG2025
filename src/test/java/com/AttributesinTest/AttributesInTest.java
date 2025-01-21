package com.AttributesinTest;

import org.testng.annotations.Test;

public class AttributesInTest {
	
	
	@Test
	public void m1() {
		
		System.out.println("m1 method");
	}
	
	@Test(alwaysRun = true)
	public void alwayRun() {
		System.out.println("this will run in all the conditions");
		
	}
	
	@Test(enabled = true)
	public void enableTrue() {
		
		System.out.println("enabletrue");
	}
	

	@Test(enabled = false)
	public void enableFalse() {
		
		System.out.println("enablefalse");
	}
	
	@Test(invocationCount = 2)
	public void innvocationcount() {
		
		System.out.println("innvocationcount");
	}

}
