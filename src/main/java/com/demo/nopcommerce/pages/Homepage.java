package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");
    By computerTab = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");



    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public void mouseHoverOnComputerTab(){
        clickOnElement(computerTab);
    }


}
