package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thingsamaze {

	public static void Main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		WebDriver myd=new ChromeDriver();
		myd.get("https://www.abc.in");
		myd.manage().window().maximize();
		String title= myd.getTitle();
	}
}

