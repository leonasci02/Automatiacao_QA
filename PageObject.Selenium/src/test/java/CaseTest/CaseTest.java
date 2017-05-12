package CaseTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.Home;
import PageObjects.Login;

public class CaseTest {

public static WebDriver driver = null;
	
public static void main(String[] args) 
{
		
		String path = "C:\\Users\\jaque\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Abrindo o navegador e Obtendo o título do site
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		String titulo = driver.getTitle();
		
		//Iniciando o teste de PageObjects
		
		Home home = new Home();
		home.MyAccount(driver).click();
		
		Login login = new Login();
		Login.UserName(driver).sendKeys("testuser_1");
		login.PassWord(driver).sendKeys("Test@123");
		login.BtnLogin(driver).click();
	}
}
