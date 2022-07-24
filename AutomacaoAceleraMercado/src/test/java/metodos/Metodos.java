package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirBrowser(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		if (url == "https://www.shoestock.com.br/") {

		} else {
			System.out.println(url);
		}

	}

	public void clicarSpan(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);
	}

	public void clicarNews(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(2000);
	}

	public void clicarSapato(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(2000);
	}

	public void clicarColor(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(4000);
	}

	public void clicarTam(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);
	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");

	}

	public void clicarBuy(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);

	}

	public void validarMsg(By elemento, String textoEncontrado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEncontrado));
		System.out.println(textoCapturado);

	}

	public void clicarDelete(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);

	}

	public void clicarVoltar(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);

	}

	public void screenshot(String nameEvidency) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File desfilFile = new File("./evidencia/" + nameEvidency + ".png");
		FileUtils.copyFile(srcFile, desfilFile);

	}

	public void fecharBrower() {
		driver.quit();
	}

}
