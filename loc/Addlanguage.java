package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addlanguage {
	public void swedish(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/my_videos?o=U&ar=1");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Edit']")));

		driver.findElement(By.xpath("//*[text()='Edit']")).click();

		driver.findElement(By.xpath("(//*[@class='yt-uix-sessionlink'])[6]")).click();

		driver.findElement(By.xpath("//*[text()='Add new subtitles or CC']")).click();

		driver.findElement(By.xpath("(//*[@placeholder='Search 190 other languages'])[2]")).sendKeys("Swedish");
		driver.findElement(By.xpath("//*[@data-search-terms='Swedish']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Create new subtitles or CC']")));
		driver.findElement(By.xpath("//*[text()='Create new subtitles or CC']")).click();
		WebElement text = driver.findElement(By.xpath("//*[@placeholder='Type subtitle here then press Enter']"));
		text.sendKeys("The club isn't the best place to find a lover");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("So the bar is where I go");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("Me and my friends at the table doing shots");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("Drinking fast and then we talk slow");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("Come over and start up a conversation with just me");
		text.sendKeys(Keys.ENTER);

		text.sendKeys("And trust me I'll give it a chance now");
		driver.findElement(By.xpath("//*[@aria-label='Add new caption line']")).click();
		text.sendKeys("Take my hand, stop, put Van the Man on the jukebox");
		driver.findElement(By.xpath("//*[@aria-label='Add new caption line']")).click();
		text.sendKeys("And then we start to dance, and now I'm singing like");
		driver.findElement(By.xpath("//*[@aria-label='Add new caption line']")).click();
		text.sendKeys("Girl, you know I want your love");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("Your love was handmade for somebody like me");
		driver.findElement(By.xpath("//*[@aria-label='Add new caption line']")).click();

		text.sendKeys("Come on now, follow my lead");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("I may be crazy, don't mind me");
		driver.findElement(By.xpath("//*[@aria-label='Add new caption line']")).click();

		text.sendKeys("Say, boy, let's not talk too much");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("Grab on my waist and put that body on me");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("Come on now, follow my lead");
		driver.findElement(By.xpath("//*[@aria-label='Add new caption line']")).click();
		text.sendKeys("Come, come on now, follow my lead");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("I'm in love with the shape of you");
		driver.findElement(By.xpath("//*[@aria-label='Add new caption line']")).click();
		text.sendKeys("We push and pull like a magnet do");
		text.sendKeys(Keys.ENTER);
		text.sendKeys("Although my heart is falling too");
		driver.findElement(By.xpath("//*[@aria-label='Add new caption line']")).click();
		text.sendKeys("I'm in love with your body");
		text.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Publish']")).click();		
		driver.findElement(By.xpath("//*[text()='234']")).click();
	}

}
