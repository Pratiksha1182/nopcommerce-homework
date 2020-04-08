package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
   By desktopsTab = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
   By buildYourOwnComputerImage = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[1]//a[1]//img[1]");
   By hddRadioButton = By.id("product_attribute_3_7");
   By addToCart = By.id("add-to-cart-button-1");
   By addedToShoppingCartText = By.xpath("//a[contains(text(),'shopping cart')]");

   public void mouseHoverOnDesktopAndClick(){ mouseHoverToElementAndClick(desktopsTab);}

   public void clickOnBuildYourOwnComputerImage(){ clickOnElement(buildYourOwnComputerImage);}

   public void clickOnHddRadioButton(){ clickOnElement(hddRadioButton);}

   public void clickOnAddToCartButton(){ clickOnElement(addToCart);}

   public String addToCartConfirmationText(){return getTextFromElement(addedToShoppingCartText);}

}
