package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase  {

    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String actualText =registerPage.registrationText();
        String expectedText = "Register";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(groups = {"sanity","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegistration();

        String expectedFirstNameMessage = "First name is required.";
        String actualFirstnameMessage = registerPage.firstNameRequireText();
        Assert.assertEquals(actualFirstnameMessage,expectedFirstNameMessage);

        String expextedLastNameMessage="Last name is required.";
        String actualLastNameMessage= registerPage.lastNameRequireText();
        Assert.assertEquals(expextedLastNameMessage,actualLastNameMessage);

        String expectedEmailMessage ="Email is required.";
        String actualEmailMessage = registerPage.emailRequireText();
        Assert.assertEquals(expectedEmailMessage,actualEmailMessage);

        String expectedPasswordMessage = "Password is required.";
        String actualPasswordMessage = registerPage.passwordRequireText();
        Assert.assertEquals(expectedPasswordMessage,actualPasswordMessage);

        String expectedConfirmPasswordMessage = "Password is required.";
        String actualConfirmPasswordMessage = registerPage.confirmPasswordRequireText();
        Assert.assertEquals(expectedConfirmPasswordMessage,actualConfirmPasswordMessage);


    }
    @Test(groups = {"regression"})
    public void averifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.gender();
        registerPage.enterFirstName("Ron");
        registerPage.enterLastName("jira");
        registerPage.selectDay("10");
        registerPage.selectMonth("November");
        registerPage.selectYear("1993");
        registerPage.enterEmail("rl123456@gmail.com");
        registerPage.enterPassword("rl12345");
        registerPage.enterConfirmPassword("rl12345");
        registerPage.clickOnRegistration();
        String actualText =registerPage.registrationCompliton();
        String expectedText = "Your registration completed";
        Assert.assertEquals(actualText,expectedText);
    }
}
