package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {
    LoginPage logInPage=new LoginPage();
    DefaultPage defaultPage=new DefaultPage();
    @Test(priority = 1)
    public void hospitalRunPage() {
        Driver.getDriver().get(ConfigReader.getProperty("portalUrl"));
        Assert.assertEquals(Driver.getDriver().getTitle(),"HospitalRun");
    }

    @Test(priority = 2)
    public void wrongUsername() {
        defaultPage.usernameBox.sendKeys(ConfigReader.getProperty("invalidUsername"));
    }
    @Test(priority = 3)
    public void wrongPassword() {
        defaultPage.passwordBox.sendKeys(ConfigReader.getProperty("invalidPassword"));
    }
    @Test(priority = 4)
    public void clickSignInButton() {
        defaultPage.signInButton.click();
    Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    Assert.assertTrue(logInPage.failedLogInText.isDisplayed());
    }
}
