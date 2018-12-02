package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addingotherlanguage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium_SW\\Browser drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");

		Thread.sleep(1000);

		gmaillogin login = new gmaillogin();
		login.gmail(driver);
		Thread.sleep(4000);
		driver.get("http://www.youtube.com/timedtext_video?ref=share&v=dcF4vJc8NVM");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Select language']")));

		driver.findElement(By.xpath("//*[text()='Select language']")).click();

		driver.findElement(By.xpath("(//*[@placeholder='Search 190 other languages'])[2]")).sendKeys("Spanish");
		driver.findElement(By.xpath("//*[@data-search-terms='Spanish']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Create new subtitles or CC']")));
		driver.findElement(By.xpath("//*[text()='Create new subtitles or CC']")).click();
		
	}

}
