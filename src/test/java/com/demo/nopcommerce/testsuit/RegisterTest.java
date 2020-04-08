package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.Homepage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    Homepage homePage = new Homepage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldRegisterSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName("Pratiksha");
        registerPage.enterLastName("Patel");
        registerPage.enterEmailId("pqrsst@gmail.com");
        registerPage.enterCompanyNameField("PBS Limited");
        registerPage.enterPassword("2810om");
        registerPage.enterconfirmpassword("2810om");
        registerPage.clickOnRegisterButton();
        String expectedText = "Your registration completed";
        String actualText = registerPage.getRegistrationComplition();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(3000);

    }
}
