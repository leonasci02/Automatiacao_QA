package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config3 {
	
	public static void main (String [] args)
	{
		//Configuração do navegador
		
		String path = "C:\\Users\\jaque\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.get(url);
		
		// Obter elemento
		
		WebElement Btn = driver.findElement(By.id("timingAlert"));
		Btn.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Aguardar elemento na tela 
		
		WebDriverWait WaitElement = new WebDriverWait(driver,10);
		
		
		Alert myAlert = WaitElement.until(ExpectedConditions.alertIsPresent());
		myAlert.accept();;
		
		driver.quit();
	}

}
