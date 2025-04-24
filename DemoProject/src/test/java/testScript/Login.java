package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base {
	@Test
	public void loginMethod()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username="admin";
		String password="admin";
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(username);
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement dash=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean ishomepageloaded=dash.isDisplayed();
		Assert.assertTrue(ishomepageloaded);
		
	}
	@Test
	public void wrongPassword()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String usname="admin";
		String password="abcd";
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(usname);
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//i[@class='icon fas fa-ban']"));
		boolean ishomepageloaded=alert.isDisplayed();
		Assert.assertTrue(ishomepageloaded);
	}
	@Test
	
	public void wrongUsername()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String usname="abcd";
		String password="admin";
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(usname);
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//i[@class='icon fas fa-ban']"));
		boolean ishomepageloaded=alert.isDisplayed();
		Assert.assertTrue(ishomepageloaded);
	}
	@Test
	public void wrongUserPass()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String usname="abcd";
		String password="efgh";
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(usname);
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//i[@class='icon fas fa-ban']"));
		boolean ishomepageloaded=alert.isDisplayed();
		Assert.assertTrue(ishomepageloaded);
	}

}
