package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By femaleRadioButton = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By companyNameField = By.id("Company");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationCompletedText = By.xpath("//div[@class='result']");

    public void clickOnRadioButton() {
        clickOnElement(femaleRadioButton);
    }

    public void enterFirstName(String FirstName) {
        sendTextToElement(firstNameField, "Pratiksha");
    }

    public void enterLastName(String Lastname) {
        sendTextToElement(lastNameField, "Patel");
    }

    public void enterEmailId(String Email) {
        sendTextToElement(emailField, "pqrs@yahoo.com");
    }

    public void enterCompanyNameField(String CompanyName) {
        sendTextToElement(companyNameField, "PBS Limited");
    }

    public void enterPassword(String Password) {
        sendTextToElement(passwordField, "2810om");
    }

    public void enterconfirmpassword(String ConfirmPassword) {
        sendTextToElement(confirmPasswordField, "2810om");
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegistrationComplition() {
        return getTextFromElement(registrationCompletedText);
    }
}
