package hihh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class yayay {
WebDriver driver;
@Test
public void amma() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
}
}
