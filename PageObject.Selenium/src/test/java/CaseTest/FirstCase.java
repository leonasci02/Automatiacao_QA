package CaseTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Home;
import PageObjects.Login;

public class FirstCase {
	
	public static WebDriver driver = null;
	
	public static void main (String[] args)
	{
		
		//Configura��o do Navegador
		
		String path = "C:\\Users\\jaque\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Abrindo o navegador e Obtendo o t�tulo do site
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		String titulo = driver.getTitle();
		
		//Instanciando os Objects
		
		Home.MyAccount(driver).click();
		Login.UserName(driver).sendKeys("testuser_1");
		Login.PassWord(driver).sendKeys("Test@123");
		Login.BtnLogin(driver).click();
		
		System.out.println("O primeiro test case passou");
		System.out.println("O Site acessado no teste � " + url + " E o t�tulo do site � "+titulo);
	}

}
