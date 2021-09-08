package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandlings {
	
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\\\Softwares\\chromedriver.exe");
    WebDriver myD = new ChromeDriver();
    myD.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
    Thread.sleep(2000);
    myD.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
    Thread.sleep(3000);
    myD.switchTo().alert().accept();
    Thread.sleep(3000);

    myD.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
    Thread.sleep(3000);

    myD.switchTo().alert().dismiss();
    Thread.sleep(3000);

    myD.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
    myD.switchTo().alert().sendKeys("ABCD");
    myD.switchTo().alert().accept();
 
     }
}