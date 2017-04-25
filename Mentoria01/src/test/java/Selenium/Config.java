package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config 
{
	public static void main (String [] args)
	
	{
	// Configura��o do Google Chrome
	
			String exePath = "C:\\Users\\jaque\\Downloads\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			
			// Link da URL 
			
			String Url = "https://twitter.com/signup?lang=pt-br";
			driver.get(Url);
			
			//Obter t�tulo do Site e Quatidade de caracteres
			
			String Titulo = driver.getTitle();		
			int QtdCaracter = driver.getTitle().length();
			
			System.out.println("O t�tlo do Site �: "+Titulo+ " A quantidade de caracteres �: "+QtdCaracter);
			
			// Valores Default

			String Nome = "Leonardo",Senha = "123456789";

				   
			
			//Obter Elementos na Tela
			
			WebElement CampoNome = driver.findElement(By.id("full-name"));
			CampoNome.sendKeys(Nome);
			
			WebElement CamCelular = driver.findElement(By.className("user[email]"));
			CamCelular.sendKeys("1176301416");
			
			WebElement CampoSenha = driver.findElement(By.id("password"));
			CampoSenha.sendKeys(Senha);
			
			WebElement BotaoIns = driver.findElement(By.className("submit button signup"));
			BotaoIns.click();

		}
}
	