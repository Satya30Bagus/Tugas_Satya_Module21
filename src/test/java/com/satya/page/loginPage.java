package com.satya.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class loginPage {

    static WebDriver driver;

    By usernameInputText = By.id("user-name");
    By passInputText = By.id("password");
    By loginButton = By.id("login-button");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public static void goToHomePage() {
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    public void inputUsername(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passInputText).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void validateErrorAppear(String errorMessage) {

        assertFalse(driver.getPageSource().contains(errorMessage));
    }
}