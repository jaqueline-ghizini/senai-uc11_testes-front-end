package testesenai;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBuscaCursos {
	private WebDriver driver;
	
	@Before 
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "D:\\Arquivos de Programas\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test 
	public void testeNavegador() {
		driver.get("https://informatica.sp.senai.br");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("informatica");
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}

/*
	@Test 
	public void testeNavegador() {
		driver.get("https://www.americanas.com.br/");
		driver.findElement(By.className("search__InputUI-sc-1wvs0c1-2")).sendKeys("cadeira gamer");
		driver.findElement(By.className("search__SearchButtonUI-sc-1wvs0c1-4")).click();
	}
	
*/
/*	@Test 
	public void testeNavegador() {
		driver.get("https://www.mercadolivre.com.br/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("nav-search-input")).sendKeys("teclado");
		driver.findElement(By.className("nav-search-btn")).click();
	}
*/
}

	
