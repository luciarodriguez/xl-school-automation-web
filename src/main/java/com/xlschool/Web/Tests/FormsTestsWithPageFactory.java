package com.xlschool.Web.Tests;

import com.xlschool.Web.Pages.FormsPage;
import com.xlschool.Web.Pages.HomePage;
import com.xlschool.Web.Pages.PracticeFormsPage;
import com.xlschool.framework.tests.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FormsTestsWithPageFactory extends BaseTest {

    @Test
    public void guionDeLucia(){
        HomePage.navigateToFormsPage();//Inside FormsPage
        FormsPage.navigateToPracticeFormPage();//Inside PracticeFormPage
        String headerStudentRegistrationFormExpectedText = "Student Registration Form";
        String headerStudentRegistrationFormActualText = PracticeFormsPage.getRegistrationFormHeader();
        Assert.assertEquals(headerStudentRegistrationFormActualText,headerStudentRegistrationFormExpectedText);
        PracticeFormsPage.clickSubmit();
        PracticeFormsPage.clickHeader();
        Assert.assertEquals(headerStudentRegistrationFormActualText, headerStudentRegistrationFormExpectedText);
        PracticeFormsPage.addIncorrectUserNumber();
        String inputMobileBorderColorHexExpected = "#dc3545";
        String inputMobileBorderColorHexActual = PracticeFormsPage.getMobileNumberColor();
        Assert.assertEquals(inputMobileBorderColorHexActual,inputMobileBorderColorHexExpected);
        PracticeFormsPage.clearMobileNumber();
        PracticeFormsPage.addCorrectUserNumber();
        String inputMobileBorderColorHexExpectedCorrect = "#28a745";
        String inputMobileBorderColorActualCorrect = PracticeFormsPage.getMobileNumberColor();
        Assert.assertEquals(inputMobileBorderColorHexExpectedCorrect,inputMobileBorderColorActualCorrect);
        PracticeFormsPage.addFirstName();
        PracticeFormsPage.addLastName();
        PracticeFormsPage.addUserEmail();
        PracticeFormsPage.clickRadioButtonFemale();
        PracticeFormsPage.clickSubjects();
        PracticeFormsPage.enterSubject();
        PracticeFormsPage.clickHobbies();
        PracticeFormsPage.enterAddress();
        PracticeFormsPage.selectState();
        PracticeFormsPage.selectCity();
        PracticeFormsPage.clickSubmit();
        PracticeFormsPage.loadConfirmationFormValues();
        String headerFormSubmissionConfirmationExpectedText = "Thanks for submitting the form";
        String headerFormSubmissionConfirmationActualText = PracticeFormsPage.getConfirmationFormHeader();
        Assert.assertEquals(headerFormSubmissionConfirmationActualText,headerFormSubmissionConfirmationExpectedText);
        Assert.assertEquals(PracticeFormsPage.getFullNameConfirmationText(),PracticeFormsPage.getFullName());
        Assert.assertEquals(PracticeFormsPage.getStudentEmailConfirmationText(),PracticeFormsPage.getEmailAddress());
        Assert.assertEquals(PracticeFormsPage.getGenderConfirmationText(),"Female");
        Assert.assertEquals(PracticeFormsPage.getMobileNumberConfirmationText(),PracticeFormsPage.getMobileNumber());
        Assert.assertEquals(PracticeFormsPage.getSubjectConfirmationText(),PracticeFormsPage.getSubjectSocial());
        Assert.assertSame(PracticeFormsPage.getHobbiesConfirmationText(),"Sports");
        Assert.assertEquals(PracticeFormsPage.getAddressConfirmationText(),PracticeFormsPage.getAddressName());
        Assert.assertEquals(PracticeFormsPage.getStateCityConfirmationText(),PracticeFormsPage.getStateCityName());
    }

    @Test
    public void printCardsTest(){
        List<WebElement> cards = HomePage.getCards();

        for (WebElement card: cards) {
            System.out.println("Card name: " + card.getText());
        }
    }




}