package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Learning_Configuration_Annotation {
			
	
		@BeforeSuite
		public void beforeSuite(){
			
			Reporter.log("Excuting Before Suite", true);
		}
		@BeforeClass
		public void beforeClass() {
			
			Reporter.log("Executing before Class", true);
		}
		
		@BeforeMethod
		public void beforeMethod() {
			
			Reporter.log("Ececuting Before Method", true);
		}
		@Test
		public void login() {
			
			Reporter.log("Executing login Test Case", true);
			
		}
		@AfterClass
		public void afterClass() {
			
			Reporter.log("Executing After Class", true);
			
		}
		@AfterMethod
		public void afterMethod() {
			
			Reporter.log("Executing After Method", true);
		}
		@Test
		public void resister() {
			
			Reporter.log("Executing Resister Test case", true);
		}
		

}
