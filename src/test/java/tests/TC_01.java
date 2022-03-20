package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01  {
    DefaultPage defaultPage = new DefaultPage();
    LoginPage logInPage=new LoginPage();

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
    public void clickSignInButton() throws InterruptedException {
        defaultPage.signInButton.click();
        Thread.sleep(15000);
        Assert.assertTrue(logInPage.patientListingText.isDisplayed());
        logInPage.cogWheelIcon.click();
        Assert.assertTrue(logInPage.logOutButton.isDisplayed());
    }
}