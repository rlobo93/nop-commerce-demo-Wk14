package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class RegisterPage extends Utility {

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(tagName = "h1")
    WebElement registrationTextField;
    public String registrationText() {
        Reporter.log("registrationText " + registrationTextField.toString());
        return getTextFromElement(registrationTextField);
    }


    @FindBy(xpath = "//label[contains(text(),'Female')]")
    WebElement genderField;
    public void gender() {
        Reporter.log("gender " + genderField.toString());
        clickOnElement(genderField);
    }

    @FindBy(id = "FirstName")
    WebElement firstNameField;
    public void enterFirstName(String firstName) {
        Reporter.log("enterFirstName " + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }


    @FindBy(id = "LastName")
    WebElement lastNameField;
    public void enterLastName(String lastName) {
        Reporter.log("enterLastName " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    @FindBy(name = "DateOfBirthDay")
    WebElement dayField;
    public void selectDay(String day) {
        Reporter.log("selectDay " + dayField.toString());
        selectByVisibleTextFromDropDown(dayField, day);
    }
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthField;
    public void selectMonth(String month) {
        Reporter.log("selectMonth " + monthField.toString());
        selectByVisibleTextFromDropDown(monthField, month);
    }

    @FindBy(name = "DateOfBirthYear")
    WebElement yearField;

    public void selectYear(String year) {
        Reporter.log("selectYear " + yearField.toString());
        selectByVisibleTextFromDropDown(yearField, year);
    }
    @FindBy(id = "Email")
    WebElement emailField;
    public void enterEmail(String email) {
        Reporter.log("enterEmail " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    @FindBy(id = "Password")
    WebElement passwordField;

    public void enterPassword(String password) {
        Reporter.log("enterPassword " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("enterConfirmPassword " + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    @FindBy(id = "register-button")
    WebElement clickOnRegisterField;

    public void clickOnRegistration() {
        Reporter.log("clickOnRegistration " + clickOnRegisterField.toString());
        clickOnElement(clickOnRegisterField);
    }

    public String registrationCompliton() {
        Reporter.log("registrationCompliton " + registrationCompletedField.toString());
        return getTextFromElement(registrationCompletedField);
    }
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequireField;
    public String firstNameRequireText() {
        Reporter.log("firstNameRequireText " + firstNameRequireField.toString());
        return getTextFromElement(firstNameRequireField);
    }

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequireField;
    public String lastNameRequireText(){
        Reporter.log("lastNameRequireText " + lastNameRequireField.toString());
        return getTextFromElement(lastNameRequireField);
    }

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequireField;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorField;
    public String emailRequireText(){
        Reporter.log("emailRequireText " + emailRequireField.toString());
        return getTextFromElement(emailRequireField);
    }

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorField;
    public String passwordRequireText(){
        Reporter.log("passwordRequireText " + passwordErrorField.toString());
        return getTextFromElement(passwordErrorField);
    }

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedField;
    public String confirmPasswordRequireText(){
        Reporter.log("confirmPasswordRequireText " + confirmPasswordErrorField.toString());
        return getTextFromElement(confirmPasswordErrorField);
    }
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinueField;

    public void clickOnContinue() {
        Reporter.log("clickOnContinue " + clickOnContinueField.toString());
        clickOnElement(clickOnContinueField);
    }









}
