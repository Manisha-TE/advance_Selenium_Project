package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {

	@Test //It act like a main method
	
	public void loginTC() {
		
		
		Reporter.log("This login Test Case1", true);
	}
	@Test //It act like a main method
	
	public void loginRC() {
		
		
		Reporter.log("This login Test Case2", true);
	}
	@Test //It act like a main method

	public void loginSC() {
	
	
	Reporter.log("This login Test Case3", true);
}
	
}
