package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config 
{
//	public static void main (String [] args)
	
	{
	// Configuração do Google Chrome
	
			String exePath = "C:\\Users\\jaque\\Downloads\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			
			// Link da URL 
			
			String Url = "https://twitter.com/signup?lang=pt-br";
			driver.get(Url);
			
			//Obter título do Site e Quatidade de caracteres
			
			String Titulo = driver.getTitle();		
			int QtdCaracter = driver.getTitle().length();
			
			System.out.println("O títlo do Site é: "+Titulo+ " A quantidade de caracteres é: "+QtdCaracter);
			
			// Valores Default

			String Nome = "Leonardo",
				   Senha = "123456789",
				   Celular = "11976301416";

			//Obter Elementos na Tela
			
			WebElement CampoNome = driver.findElement(By.id("full-name"));
			CampoNome.sendKeys(Nome);
			
			WebElement CamCelular = driver.findElement(By.id("email"));
			CamCelular.sendKeys(Celular);
			
			WebElement CampoSenha = driver.findElement(By.id("password"));
			CampoSenha.sendKeys(Senha);
			
			WebElement BotaoIns = driver.findElement(By.className("submit button signup"));
			BotaoIns.click();

		}
}
	