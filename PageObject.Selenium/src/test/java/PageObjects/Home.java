package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	public static WebElement element = null;
	
	public static WebElement MyAccount(WebDriver driver)
	{
		element = driver.findElement(By.id("account"));
		return element;
	}
	
	public static WebElement Logoff(WebDriver driver)
	{
		element = driver.findElement(By.id("account_logout"));
		return element;
	}
}
