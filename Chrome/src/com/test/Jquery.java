package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(2000);
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        //myD.switchTo().frame(0);
        //myD.switchTo().frame("ID or NAME");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
 
        System.out.println(driver.findElement(By.id("draggable")).getText());

        WebElement vDrag=driver.findElement(By.id("draggable"));
        WebElement vDrop=driver.findElement(By.id("droppable"));

        Actions act=new Actions(driver);
        act.dragAndDrop(vDrag, vDrop).build().perform();

        Thread.sleep(5000);

        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.className("entry-title")).getText());
	driver.quit();
	}
}
