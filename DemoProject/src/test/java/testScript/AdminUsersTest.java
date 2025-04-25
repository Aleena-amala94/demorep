package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AdminUsersPage;
import Pages.LoginPage;
import Utility.ExcelUtility;
//import Utility.FakerUtility;

public class AdminUsersTest extends Base{
	@Test
	public void verifyThatUserIsAbleToSaveUserDeatils() throws Exception
	{
		
		//String username="admin";
		//String password="admin";
        //String adminusername="aleena";
       // String adminpassword="abcd";
		String username=ExcelUtility.readStringData(1, 0,"loginpage");
		String password=ExcelUtility.readStringData(1, 1,"loginpage");
		/*FakerUtility fakerutility=new FakerUtility();
		String adminusername=fakerutility.creatARandomFirstName();
		String adminpassword=fakerutility.creatARandomFirstName();*/
		String adminusername=ExcelUtility.readStringData(0, 0,"adminuserpage");
		String adminpassword=ExcelUtility.readStringData(0, 1,"adminuserpage");
        
        LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		AdminUsersPage adminuserpage=new AdminUsersPage(driver);
		adminuserpage.adminUsersInfo();
		adminuserpage.adminUserNew();
		adminuserpage.adminUserName(adminusername);
		adminuserpage.adminUserPassword(adminpassword);
		adminuserpage.adminUserType();
		adminuserpage.adminUserSave();
		adminuserpage.isAlertDisplayed();
		boolean alertdisplayed=adminuserpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed);
}
}
