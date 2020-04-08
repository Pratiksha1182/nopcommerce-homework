package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.Homepage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    Homepage homePage = new Homepage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);

    }
    @Test
    public void userShouldLogInSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("pratikshapatel1182@gmail.com");
        loginPage.enterPassword("2810om");
        loginPage.clickOnLoginButton();
        String expectedText = "Welcome to our store";
        String actualText = loginPage.getWelcomeText1();
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNotLogInSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("abcdefg@yahoo.com");
        loginPage.enterPassword("2810om");
        loginPage.clickOnLoginButton();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String actualText = loginPage.getErrorLoginWasUnsuccefulText();
        Assert.assertEquals(expectedText,actualText);
    }

}
