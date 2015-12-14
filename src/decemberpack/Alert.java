package decemberpack;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {


	public static void main(String[] args) {
		Logger logger = Logger.getLogger("Alert");
		PropertyConfigurator.configure("Log4j.properties");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.ksrtc.in/");
		WebElement su = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[8]/a/font"));
	su.click();
		 String text = driver.switchTo().alert().getText();
		 System.out.println(text);
		 driver.switchTo().alert().accept();
		driver.quit();
		
	}

}
