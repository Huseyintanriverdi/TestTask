package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LogOutPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_03 {
    LoginPage logInPage = new LoginPage();
    DefaultPage defaultPage= new DefaultPage();
    LogOutPage logOutPage= new LogOutPage();

    @Test(priority = 1)
    public void hospitalRunPage() {
        Driver.getDriver().get(ConfigReader.getProperty("portalUrl"));
    }

    @Test(priority = 2)
    public void correctUsername() {
        defaultPage.usernameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @Test(priority = 3)
    public void correctPassword() {
        defaultPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }
    @Test(priority = 4)
    public void clickSignInButton() {
        defaultPage.signInButton.click();
        logInPage.cogWheelIcon.click();
        logInPage.logOutButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
        Assert.assertTrue(logOutPage.pleaseSignInText.isDisplayed());
    }
}
