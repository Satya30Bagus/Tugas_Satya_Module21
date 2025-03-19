package com.satya.stepDef;

import com.satya.BaseTest;
import com.satya.page.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDef extends BaseTest {

    loginPage loginpage;

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        loginpage = new loginPage(driver);
        loginpage.goToLoginPage();
    }

    @Then("User is on homepage")
    public void userIsOnHomePage(){
        loginPage.goToHomePage();
    }

    @When("User input username with {string}")
    public void userInputUsernameWith(String username) {
        loginpage.inputUsername(username);
    }

    @And("User input password with {string}")
    public void userInputPasswordWith(String password) {
        loginpage.inputPassword(password);
    }

    @And("User click login button")
    public void userClickLoginButton() {
        loginpage.clickLoginButton();
    }

    @And("User is on login page")
    public void userIsOnLoginPage() {
        loginpage.goToLoginPage();
    }

    @Then("User able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {
        loginpage.validateErrorAppear(errorMessage);
    }
}