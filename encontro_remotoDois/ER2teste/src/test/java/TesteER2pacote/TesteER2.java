package TesteER2pacote;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
/*import org.openqa.selenium.Keys;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteER2 {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "D:\\Arquivos de Programas\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	/*
	public void TesteNavegador() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("gLFyf")).sendKeys("senai");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);
		driver.findElement(By.className("LC20lb")).click();
	}*/
	
	public void TesteNavegador() {
		driver.get("http://localhost:4200/");
		driver.manage().window().maximize();
		driver.findElement(By.className("usuario")).click();
		WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement inputSenha = driver.findElement(By.id("senha"));
		WebElement botaoLogin = driver.findElement(By.id("botao-enviar"));

		inputEmail.sendKeys("algum@gmail.com");
		inputSenha.sendKeys("senha124");
		botaoLogin.click();
		}
}
