package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/");
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/a"));
		actions.moveToElement(mainMenu).perform();
		WebElement subMenu = driver.findElement(By.linkText("Calculators & Resources"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[3]/a")).click();
		String title= driver.getTitle();
		System.out.println("Title is"+driver.getTitle());
		driver.close();
	}

}
