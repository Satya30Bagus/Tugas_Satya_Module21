package com.satya.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class checkOutPage {

    private static WebDriver driver;

    public checkOutPage(WebDriver driver) {

        this.driver = driver;
    }


    By buttonCheckout = By.id("checkout");
    By tittleHeaderCheckout = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By tittleHeaderCart = By.xpath("/html/body/div/div/div/div[1]/div[2]/span");
    By buttonCancelCheckout = By.id("cancel");
    By firstnameInputText = By.id("first-name");
    By lastnameInputText = By.id("last-name");
    By portalcodeInputText = By.id("postal-code");
    By buttonContinueCheckout = By.id("continue");
    By buttonAddToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By buttonCart = By.id("shopping_cart_container");


    public void clickButtonCheckout(){
        driver.findElement(buttonCheckout).click();
    }

    public void validateYourInfoPage(){
        WebElement productElement = driver.findElement(tittleHeaderCheckout);
        assertTrue(productElement.isDisplayed());
        assertEquals("Checkout: Your Information", productElement.getText());
    }

    public void validateOverviewPage(){
        WebElement productElement = driver.findElement(tittleHeaderCart);
        assertTrue(productElement.isDisplayed());
        assertEquals("Your Cart", productElement.getText());
    }

    public void validatecheckoutOverviewPage(){
        WebElement productElement = driver.findElement(tittleHeaderCheckout);
        assertTrue(productElement.isDisplayed());
        assertEquals("Checkout: Overview", productElement.getText());
    }

    public static void goToProductLisPage() {
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    public void clickButtonCancelCheckout(){
        driver.findElement(buttonCancelCheckout).click();
    }

    public void clickAddCartBackPack (){
        driver.findElement(buttonAddToCartBackpack).click();
    }

    public void clickButtonCart (){
        driver.findElement(buttonCart).click();
    }

    public void inputFirstName(String firstname) {
        driver.findElement(firstnameInputText).sendKeys(firstname);
    }

    public void inputLastName(String lastname) {
        driver.findElement(lastnameInputText).sendKeys(lastname);
    }

    public void inputPortalCode(String portalcode) {
        driver.findElement(portalcodeInputText).sendKeys(portalcode);
    }

    public void validateErrorMessageYourInfoFalse (String errorMessageYourInfo){
        assertFalse(driver.getPageSource().contains(errorMessageYourInfo));
    }

    public void validateErrorMessageYourInfo (String errorMessageYourInfo){
        assertTrue(driver.getPageSource().contains(errorMessageYourInfo));
    }

    public void clickButtonContinueCheckout(){
        driver.findElement(buttonContinueCheckout).click();
    }

}