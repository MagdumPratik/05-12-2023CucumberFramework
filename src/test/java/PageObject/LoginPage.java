package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="Email")
	WebElement Email;
	
	@FindBy(name="Password")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement clickLogin;
	
	@FindBy(xpath="(//a[normalize-space()='Logout'])[1]")
	WebElement clickLogout;
	
	public void setEmail(String e)
	{
		Email.clear();
		Email.sendKeys(e);
	}
	
	public void setPassword(String pass)
	{
		Password.clear();
		Password.sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		clickLogin.click();
	}
	
	public void clickLogout()
	{
		clickLogout.click();
	}
}
