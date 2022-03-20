package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LogOutPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_04 {
    LoginPage logInPage = new LoginPage();
    DefaultPage defaultPage=new DefaultPage();
    LogOutPage logOutPage=new LogOutPage();

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
    }

    @Test(priority = 5)
    public void clickMedicationItem() {
        logInPage.medicationItem.click();
        Assert.assertTrue(logInPage.medicationSubItems.getText().contains("Requests"));
        Assert.assertTrue(logInPage.medicationSubItems.getText().contains("Completed"));
        Assert.assertTrue(logInPage.medicationSubItems.getText().contains("New Request"));
        Assert.assertTrue(logInPage.medicationSubItems.getText().contains("Return Medication"));
    }

    @Test(priority = 6)
    public void clickNewRequestItem() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        logInPage.medicationSubItemNewRequest.click();
        Thread.sleep(15000);
        actions.click(logInPage.newPatientTextBox).sendKeys("Test - Patient - P00201").perform();
        actions.click(logInPage.medicineTextBox).sendKeys("Pra").perform();
        actions.click(logInPage.prescriptionTextBox).sendKeys("Test Prescription").perform();
        logInPage.prescriptionDateTextBox.clear();
        actions.click(logInPage.prescriptionDateTextBox).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ENTER).perform();
        Thread.sleep(20000);
        actions.click(logInPage.medicineTextBox).sendKeys("mo").perform();
        Thread.sleep(5000);
        actions.sendKeys(Keys.TAB).perform();
        actions.click(logInPage.quantityTextBox).sendKeys("2").sendKeys(Keys.TAB).sendKeys("8").perform();
        Thread.sleep(5000);
        logInPage.addNewMedicationButton.click();
        Thread.sleep(8000);
        actions.sendKeys(Keys.NUMPAD2).click(logInPage.addNewMedicationButtonTwo).perform();
        Thread.sleep(8000);
        Assert.assertTrue(logInPage.medicationRequestSavedPopupIsDisplayed.isDisplayed());
        Thread.sleep(8000);
        Assert.assertTrue(logInPage.popUpCrossButton.isDisplayed());
        Assert.assertTrue(logInPage.popupOkButton.isDisplayed());
        logInPage.popupOkButton.click();
        Assert.assertTrue(logInPage.medicationRequestText.isDisplayed());
    }
}