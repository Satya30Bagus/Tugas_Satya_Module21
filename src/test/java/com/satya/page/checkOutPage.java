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
    By buttonCancelCheckout = By.id("cancel");
    By firstnameInputText = By.id("first-name");
    By lastnameInputText = By.id("last-name");
    By portalcodeInputText = By.id("postal-code");
    //By errorMessageCheckout = By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]");
    By buttonContinueCheckout = By.id("continue");
    By buttonCart = By.id("shopping_cart_container");
    By cartPage = By.id("header_container");
    By buttonFinishCheckout = By.id("finish");
    By buttonBacktoHome = By.id("back-to-products");
    By descOrderComplete = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

    public void clickButtonCheckout(){

        driver.findElement(buttonCheckout).click();
    }

    public void validateOnCartPage (){
        WebElement productElement = driver.findElement(cartPage);
        assertTrue(productElement.isDisplayed());
        assertEquals("menu_button_container", productElement.getText());
    }




    public void validateYourInfoPage(){

        WebElement productElement = driver.findElement(tittleHeaderCheckout);
        assertTrue(productElement.isDisplayed());
        assertEquals("Checkout: Your Information", productElement.getText());
    }

    public void validateOverviewPage(){

        WebElement productElement = driver.findElement(tittleHeaderCheckout);
        assertTrue(productElement.isDisplayed());
        assertEquals("Checkout: Overview", productElement.getText());
    }

    public void clickButtonCancelCheckout(){

        driver.findElement(buttonCancelCheckout).click();
    }

    public void clickButtonCart(){
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

    public void clickButtonFinishCheckout(){

        driver.findElement(buttonFinishCheckout).click();
    }

    public void clickButtonBackHome(){

        driver.findElement(buttonBacktoHome).click();
    }

    public void validateOrderComplete(){

        WebElement productElement = driver.findElement(descOrderComplete);
        assertTrue(productElement.isDisplayed());
        assertEquals("Thank you for your order!", productElement.getText());
    }


}