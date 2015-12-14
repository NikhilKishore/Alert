package learn.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.ksrtc.in");
		WebElement se = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[8]/a/font"));
se.click();
String alert = driver.switchTo().alert().getText();
System.out.println(alert);
driver.switchTo().alert().accept();
driver.close();


	}

}
