package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
	    WebDriver myD = new ChromeDriver();
	    myD.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMIsOSMuqH38gIVx30rCh1dtggeEAAYASAAEgLecvD_BwE&gclid=EAIaIQobChMIsOSMuqH38gIVx30rCh1dtggeEAAYASAAEgLecvD_BwE");
	    Thread.sleep(3000);
	    myD.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[2]/label[2]/div[2]/p")).click();
	    boolean Display = myD.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[2]/div[2]/h4")).isDisplayed();
	    System.out.println("Element displayed is :"+Display);
	    
	    WebElement e = myD.findElement(By.xpath("//*[text()='Return on']"));
        System.out.println("Element with text(): " + e.getText() );
        
        if(Display==true)
        {
        	 System.out.println("Pass");
        }
        else
        {
        	System.out.println("Fail");
        }
	    myD.close();
	}

}
