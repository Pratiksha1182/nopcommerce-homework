package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']//h1");
    By welcomeText1 = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By errorLoginWasUnsuccessfulText = By.xpath("//div[@class='message-error validation-summary-errors']");


    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginBtn);
    }


    public String getWelcomeText(){ return getTextFromElement(welcomeText); }
    public String getWelcomeText1(){ return getTextFromElement(welcomeText1);}
    public String getErrorLoginWasUnsuccefulText(){return getTextFromElement(errorLoginWasUnsuccessfulText);}

}
