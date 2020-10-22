package com.xlschool.Web.Pages;

import com.github.javafaker.Faker;
import com.xlschool.framework.pages.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.xlschool.framework.driver.DriverHandler.getDriver;
import static com.xlschool.framework.utils.Utils.*;
import static com.xlschool.framework.datahelper.formdata.*;

public class PracticeFormsPage extends BasePage {

    @FindBy(xpath = "//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]")
    private static WebElement headerStudentRegistrationForm;
    @FindBy(xpath = "//div[@class='modal-title h4']")
    private static WebElement headerConfirmationForm;
    @FindBy(id = "submit")
    private static WebElement buttonSubmitStudentRegistrationForm;
    @FindBy(id = "userNumber")
    private static WebElement inputMobile;
    @FindBy(id = "firstName")
    private static WebElement inputFirstName;
    @FindBy(id = "lastName")
    private static WebElement inputLastName;
    @FindBy(id = "userEmail")
    private static WebElement inputUserEmail;
    @FindBy(xpath = "//div[@id='genterWrapper']//label[contains(string(),'Female')]")
    private static WebElement radiobuttonFemale;
    @FindBy(xpath = "//*[@id='subjectsContainer']/div")
    private static WebElement containerSubjects;
    @FindBy(xpath = "//*[@id='subjectsContainer']//input")
    private static WebElement inputSubjects;
    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[contains(string(),'Sports')]")
    private static WebElement hobbiesSports;
    @FindBy(id = "currentAddress")
    private static WebElement currentAddress;
    @FindBy(id = "state")
    private static WebElement stateDropdown;
    @FindBy(id = "react-select-3-input")
    private static WebElement inputStateOption;
    @FindBy(id = "city")
    private static WebElement cityDropdown;
    @FindBy(id = "react-select-4-input")
    private static WebElement inputCityOption;
    @FindBy(xpath = "//tbody//tr[contains(string(),'Student Name')]")
    private static WebElement fullNameConfirmation;
    @FindBy(xpath = "//tbody//tr[contains(string(),'Student Email')]")
    private static WebElement studentEmailConfirmation;
    @FindBy(xpath = "//tbody//tr[contains(string(),'Gender')]")
    private static WebElement genderConfirmation;
    @FindBy(xpath = "//tbody//tr[contains(string(),'Mobile')]")
    private static WebElement mobileNumberConfirmation;
    @FindBy(xpath = "//tbody//tr[contains(string(),'Subjects')]")
    private static WebElement subjectConfirmation;
    @FindBy(xpath = "//tbody//tr[contains(string(),'Hobbies')]")
    private static WebElement hobbiesConfirmation;
    @FindBy(xpath = "//tbody//tr[contains(string(),'Address')]")
    private static WebElement addressConfirmation;
    @FindBy(xpath = "//tbody//tr[contains(string(),'State')]")
    private static WebElement stateCityConfirmation;

    public static String getRegistrationFormHeader(){
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();
        return headerStudentRegistrationForm.getText();
    }

    public static void clickHeader(){
        scrollToElement(headerStudentRegistrationForm);
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();
    }

    public static String getConfirmationFormHeader(){
        highlighElement(headerConfirmationForm);
        pauseDriver();
        return headerConfirmationForm.getText();
    }

    public static void clickSubmit() {
        if (!noScroll) {
            scrollToElement(buttonSubmitStudentRegistrationForm);
        }
        highlighElement(buttonSubmitStudentRegistrationForm);
        buttonSubmitStudentRegistrationForm.click();
        pauseDriver();

    }

    public static void getLanding() {
        PageFactory.initElements(getDriver(),PracticeFormsPage.class);
    }

    public static void addCorrectUserNumber(){
        highlighElement(inputMobile);
        pauseDriver();
        inputMobile.sendKeys(mobileNumberConfirmationText);
    }

    public static void addIncorrectUserNumber(){
        highlighElement(inputMobile);
        pauseDriver();
        inputMobile.sendKeys(firstName);
    }

    public static String getMobileNumberColor() {
        pauseDriver();
        String inputMobileBorderColorHexActual = Color.fromString(inputMobile.getCssValue("border-color")).asHex();
        return inputMobileBorderColorHexActual;
    }

    public static void clearMobileNumber() {
        inputMobile.clear();
    }

    public static void addFirstName(){
        highlighElement(inputFirstName);
        pauseDriver();
        inputFirstName.sendKeys(firstName);
    }

    public static void addLastName(){
        highlighElement(inputLastName);
        pauseDriver();
        inputLastName.sendKeys(lastName);
    }

    public static void addUserEmail(){
        highlighElement(inputUserEmail);
        pauseDriver();
        inputUserEmail.sendKeys(studentEmailConfirmationText);
    }

    public static void clickRadioButtonFemale(){
        highlighElement(radiobuttonFemale);
        pauseDriver();
        radiobuttonFemale.click();
    }

    public static void clickSubjects(){
        highlighElement(containerSubjects);
        containerSubjects.click();
        pauseDriver();
        inputSubjects.click();
    }

    public static void enterSubject(){
        pauseDriver();
        inputSubjects.sendKeys(subjectConfirmationText);
        pauseDriver();
        inputSubjects.sendKeys(Keys.RETURN);
    }

    public static void clickHobbies(){
        highlighElement(hobbiesSports);
        pauseDriver();
        hobbiesSports.click();
    }

    public static void enterAddress(){
        scrollToElement(buttonSubmitStudentRegistrationForm);
        pauseDriver();
        currentAddress.sendKeys(addressConfirmationText);
    }

    public static void selectState(){
        stateDropdown.click();
        pauseDriver();
        inputStateOption.sendKeys(stateName, Keys.RETURN);
    }

    public static void selectCity(){
        cityDropdown.click();
        pauseDriver();
        inputCityOption.sendKeys(cityName, Keys.RETURN);
    }

    public static void loadConfirmationFormValues(){
        String fullNameConfirmationText = fullNameConfirmation.getText();
        String emailAddressConfirmationText = studentEmailConfirmation.getText();
        String genderConfirmationText = genderConfirmation.getText();
        String mobileNumberConfirmationText = mobileNumberConfirmation.getText();
        String subjectConfirmationText = subjectConfirmation.getText();
        String hobbiesConfirmationText = hobbiesConfirmation.getText();
        String addressConfirmationText = addressConfirmation.getText();
        String stateCityConfirmationText = stateCityConfirmation.getText();
    }

    public static String getFullNameConfirmationText() { return fullNameConfirmationText; }
    public static String getGenderConfirmationText(){ return genderConfirmationText; }
    public static String getHobbiesConfirmationText(){ return hobbiesConfirmationText; }
    public static String getStateCityConfirmationText(){ return stateCityConfirmationText; }
    public static String getStudentEmailConfirmationText(){ return studentEmailConfirmationText; }
    public static String getMobileNumberConfirmationText(){ return mobileNumberConfirmationText; }
    public static String getSubjectConfirmationText(){ return subjectConfirmationText; }
    public static String getAddressConfirmationText(){ return addressConfirmationText; }

    public static String getFullName() {
        return fullNameConfirmationText;
    }

    public static String getEmailAddress(){
        return studentEmailConfirmationText;
    }

    public static String getMobileNumber(){
        return mobileNumberConfirmationText;
    }

    public static String getGender(){
        return genderConfirmationText;
    }

    public static String getSubjectSocial(){
        return subjectConfirmationText;
    }

    public static String getAddressName(){
        return addressConfirmationText;
    }

    public static String getStateCityName(){
        return stateCityConfirmationText;
    }
}
