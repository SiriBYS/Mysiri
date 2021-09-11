package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
	    WebDriver myD = new ChromeDriver();
	    myD.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
	    Thread.sleep(3000);
	    myD.findElement(By.xpath("//*[@id=\"food\"]")).sendKeys("200");
	    myD.findElement(By.xpath("//*[@id=\"clothing\"]")).sendKeys("200");
	    myD.findElement(By.xpath("//*[@id=\"shelter\"]")).sendKeys("200");
	    myD.findElement(By.xpath("//*[@id=\"monthlyPay\"]")).sendKeys("200");
	    myD.findElement(By.xpath("//*[@id=\"monthlyOther\"]")).sendKeys("200");
	}

}
