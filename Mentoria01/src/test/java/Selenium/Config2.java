package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Config2 {
	
//	public static void main (String [] args) throws Exception
	{
		//Configuração do Google Chrome
		
		String exePath = "C:\\Users\\jaque\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Link da URL 
		
		String URL = "http://toolsqa.com/automation-practice-form/";
		driver.get(URL);
		
		
		// Obter Elemento de Campo Texto
		
		String FirstName = "Leonardo",
			   LastName = "Nascimento";
		
		WebElement NomeUm = driver.findElement(By.name("firstname"));
		NomeUm.sendKeys(FirstName);
		
		WebElement NomeDois = driver.findElement(By.name("lastname"));
		NomeDois.sendKeys(LastName);
		
		// Obter Elemento de RadioButton - Sexo
		
		List<WebElement> Rdb_sex = driver.findElements(By.name("sex"));
		
		boolean Rdb_value = false;
		Rdb_value = Rdb_sex.get(0).isSelected();
		
		if (Rdb_value == true)
		{
			Rdb_sex.get(1).click();
		}
		else
		{
			Rdb_sex.get(0).click();
		}
		
		// Obter Elemento de RadionButton Exp
		
		WebElement oExp  = driver.findElement(By.id("exp-1")); 
		oExp.click();
		
		// Obter Elemento Data de Nascimento
		
		String Data = "15-06-1994";
		
		WebElement DataNasc = driver.findElement(By.id("datepicker"));
		DataNasc.sendKeys(Data);
		
		List <WebElement> Chk_prof = driver.findElements(By.name("profession"));
		
		int Prof_size = Chk_prof.size();
		for (int i = 0; i < Prof_size; i++ )
		{
			String Prof_value = Chk_prof.get(i).getAttribute("value");
			
			if (Prof_value.equalsIgnoreCase("Manual Tester"))
			{
				Chk_prof.get(i).click();
			}
		}
		
		//Obter check box sem percorrer lista 
		
		WebElement oCheck  = driver.findElement(By.id("tool-2")); 
		oCheck.click();
		
		// Elemento do tipo DropDown
		
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		oSelect.selectByVisibleText("Africa");
		
		// Elemento Multiple
	
		Select cSelect = new Select(driver.findElement(By.id("selenium_commands")));
		cSelect.selectByVisibleText("Navigation Commands");
		
		driver.quit();
	}
}
