package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {

	public static void main(String [] args)
	{
		
		String Url = "https://www.makemytrip.com/",
			   Idbutton = "js-switch__option";
		
		// Configuração e execução do navegador
		
		String path = "C:\\Users\\jaque\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		
		//Obter Elementos na tela
		
		List<WebElement> listBtn = driver.findElements(By.id(Idbutton));
		int listSize = listBtn.size();
		
		for (int i = 0; listSize < i;i++)
		{
			String value = listBtn.get(i).getAttribute("value");
			
			if (value.equalsIgnoreCase("round trip"))
			{
				listBtn.get(i).click();
			}
		}
		
		WebElement element = driver.findElement(By.id("hp-widget__sfrom"));
		element.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ui-id-158")).click();
		driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.TAB);;
		driver.findElement(By.id("ui-id-281")).click();
	}

}
