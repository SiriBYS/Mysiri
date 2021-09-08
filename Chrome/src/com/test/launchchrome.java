package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchchrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		WebDriver myd=new ChromeDriver();
		myd.get("https://www.google.com");
		myd.manage().window().maximize();
		myd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		myd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		String searchdata = myd.findElement(By.xpath("//input[@aria-label='Search']")).getAttribute("Value");
		int size=myd.findElements(By.xpath("//*[@type='submit']")).size();
		System.out.println(size);
		String title= myd.getTitle();
		if(title.contains("Selenium"))
		{
			System.out.println("Navigated to the Result Page");
			System.out.println(searchdata);
			if(searchdata.equalsIgnoreCase("Selenium"))
			{
				System.out.println("Search Engine works as expected");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		else
		{
			System.out.println("Fail");
		}
		
		String Timetaken= myd.findElement(By.xpath("/html/body/div[7]/div/div[6]/div/div/div/div/div/nobr")).getText();
	    System.out.println(Timetaken);
	    myd.close();
	}

}
