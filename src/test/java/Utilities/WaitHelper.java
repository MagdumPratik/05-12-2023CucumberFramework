package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	public WebDriver driver;
	public WaitHelper(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  void WaitForEllement(WebElement element, long timeOutInSecond)
	{
		WebDriverWait wait=new WebDriverWait(driver, timeOutInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
