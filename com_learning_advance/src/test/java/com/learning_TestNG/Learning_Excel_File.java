package com.learning_TestNG;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic_Library.Java_Utility;

public class Learning_Excel_File {

	@Test
	public void resisterTest() throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");

		// Java representation object of excel file
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData/testScriptData.xlsx");

		// Open excel in read mode
		Workbook book = WorkbookFactory.create(fis);

		// Open sheet by name

		Sheet sheet = book.getSheet("registerData");

		// Go to specific row
		Row row = sheet.getRow(1);

		// Go to specific cell
		Cell cell = row.getCell(0);
		// Fetch the data
		String firstname = cell.toString();
		String lastname = row.getCell(1).toString();
		String email = row.getCell(2).toString();
		String nEmail= firstname+Java_Utility.getRandonNumber()+"@gmail.com";
		String password = row.getCell(3).toString();
		String cPassword = row.getCell(4).toString();
		String gender = row.getCell(5).toString();

		driver.findElement(By.linkText("Register")).click();
		if (gender.equals("M")) {

			driver.findElement(By.id("gender-male")).click();

		}else {
			
			driver.findElement(By.id("gender-male")).click();
			
		}
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(nEmail);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cPassword);
		driver.findElement(By.id("register-button")).click();
	}
}
