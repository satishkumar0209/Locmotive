package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shareingthelink {
	public void share(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.youtube.com/timedtext_video?ppub_lang=sv&msg=9&v=dcF4vJc8NVM&ar=1");
		Thread.sleep(2000);
		driver.findElement(By.id("switch-video-contrib-link")).click();
		Thread.sleep(5000);
		WebElement time=driver.findElement(By.id("captions-fan-video-link\""));
		time.click();
		time.sendKeys(Keys.chord(Keys.CONTROL,"c"));  
		time.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		System.out.println(time);
		time.getText();
		System.out.println(time);
		time.getAttribute("value");
		System.out.println(time);
		WebElement values=driver.findElement(By.xpath("//*[@class='captions-fan-link']"));
		values.getAttribute("attributeName");
		//values.getTagName();
		System.out.println(values);
		System.out.println("22");
	}

}
