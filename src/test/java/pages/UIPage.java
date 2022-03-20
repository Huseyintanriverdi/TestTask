package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UIPage {
    public UIPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="identification")
    public WebElement usernameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath ="//a[@class='settings-trigger ']")
    public WebElement cogWheelIcon;

    @FindBy(xpath = "//h1[text()='Patient Listing']")
    public WebElement patientListingText;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//div[@class='alert alert-danger form-signin-alert']")
    public WebElement failedLogInText;

    @FindBy(id="ember767")
    public WebElement medicationItem;

    @FindBy(linkText = "New Request")
    public WebElement medicationSubItemNewRequest;

    @FindBy(xpath = "//div[@class='category-sub-items']")
    public WebElement medicationSubItems;

    @FindBy(xpath="//input[@class='form-control ember-text-field ember-view tt-input']")
    public WebElement newPatientTextBox;

    @FindBy(id="inventoryItemTypeAhead-ember1415")
    public WebElement medicineTextBox;

    @FindBy(id="prescription-ember1447")
    public WebElement prescriptionTextBox;

    @FindBy(id="display_prescriptionDate-ember1470")
    public WebElement prescriptionDateTextBox;

    @FindBy(id="quantity-ember1489")
    public WebElement quantityTextBox;

    @FindBy(xpath = "//button[text()='Add']")
    public WebElement addNewMedicationButton;

    @FindBy(xpath = "(//button[@class='btn btn-primary on-white '])[2]")
    public WebElement addNewMedicationButtonTwo;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement popUpCrossButton;

    @FindBy(xpath = "(//button[@class='btn btn-primary on-white '])[2]")
    public WebElement popupOkButton;

    @FindBy(tagName = "h4")
    public WebElement medicationRequestSavedPopupIsDisplayed;

    @FindBy(tagName = "h1")
    public WebElement medicationRequestText;

    @FindBy(tagName = "h2")
    public WebElement pleaseSignInText;

}
