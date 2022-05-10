package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class HomePage extends Utility {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    public void clickOnLoginLink() {
        Reporter.log("clickOnLoginLink " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public String loginButtonText() {
        Reporter.log("loginButtonText " + loginLink.toString());
        return getTextFromElement(loginLink);
    }


    @FindBy(linkText = "Register")
    WebElement registerLink;

    public void clickOnRegisterLink() {
        Reporter.log("clickOnRegisterLink " + registerLink.toString());

        clickOnElement(registerLink);
    }

    @FindBy(linkText = "Log out")
    WebElement logOutLink;

    public String logOutTextLink() {
        Reporter.log("logOutTextLink " + logOutLink.toString());
        return getTextFromElement(logOutLink);
    }


    public void clickOnLogoutButton() {
        Reporter.log("clickOnLogoutButton " + logOutLink.toString());
        clickOnElement(logOutLink);
    }

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerField;

    public void clickOnComputer() {
        Reporter.log("clickOnComputer " + computerField.toString());

        clickOnElement(computerField);
    }


    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronicsField;

    public void clickOnelectronics() {
        Reporter.log("clickOnelectronics " + electronicsField.toString());

        clickOnElement(electronicsField);
    }


    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement apparelField;

    public void clickOnApparel() {
        Reporter.log("clickOnApparel " + apparelField.toString());

        clickOnElement(apparelField);
    }

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement digitalDownloadField;

    public void clickOnDigitalDownload() {
        Reporter.log("clickOnDigitalDownload " + digitalDownloadField.toString());

        clickOnElement(digitalDownloadField);
    }

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement booksField;

    public void clickOnBook() {
        Reporter.log("clickOnBook " + booksField.toString());

        clickOnElement(booksField);
    }

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement jewelryField;

    public void clickOnJewelry() {
        Reporter.log("clickOnJewelry " + jewelryField.toString());

        clickOnElement(jewelryField);
    }


    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftCardsField;

    public void clickOnGiftCards() {
        Reporter.log("clickOnGiftCards " + giftCardsField.toString());

        clickOnElement(giftCardsField);
    }

    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopcommerceLogoField;

    public String nopcommerceLogoText() {
        Reporter.log("nopcommerceLogoText " + nopcommerceLogoField.toString());
        return getTextFromElement(nopcommerceLogoField);
    }


    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountField;

    public void clickOnMyAccount() {
        Reporter.log("clickOnMyAccount " + myAccountField.toString());
        clickOnElement(myAccountField);
    }


}
