package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utility.ExcelUtility;
import constants.Constants;

public class LoginTest extends Base {
	@	Test 
	public void verifyWhetherUserIsAbleToLoginUsingValidCrenditials() throws Exception
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		//String username="admin";
		//String password="admin";
		String username=ExcelUtility.readStringData(1, 0,"loginpage");
		String password=ExcelUtility.readStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		
		boolean isdashboardloaded=loginpage.isHomePageLoaded();
		Assert.assertTrue(isdashboardloaded,"homepage is loaded with incorrect password");
	}
	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class,description="")
	public void verifyWhetherUserIsAbleToLoginUsingCorrectUsernameAndIncorrectPassword() throws Exception
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		//String username="admin";
		//String password="abcd";
		String username=ExcelUtility.readStringData(2, 0,"loginpage");
		String password=ExcelUtility.readStringData(2, 1,"loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		loginpage.redAlert();
		boolean alert=loginpage.redAlert();
		Assert.assertTrue(alert,Constants.INCORRECTPASSWORD);
		
		
	}
	@Test
	public void verifyWhetherUserIsAbleToLoginUsinginCorrectUsernameAndcorrectPassword() throws Exception
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		//String username="abcd";
		//String password="admin";
		String username=ExcelUtility.readStringData(3, 0, "loginpage");
		String password=ExcelUtility.readStringData(3, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		loginpage.redAlert();
		boolean alert=loginpage.redAlert();
		Assert.assertTrue(alert);
	}
	@Test
	public void verifyWhetherUserIsAbleToLoginUsinginCorrectUsernameAndincorrectPassword() throws Exception
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		//String username="abcd";
		//String password="efgh";
		
		String username=ExcelUtility.readStringData(4, 0, "loginpage");
		String password=ExcelUtility.readStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		loginpage.redAlert();
		boolean alert=loginpage.redAlert();
		Assert.assertTrue(alert);
	}
}

