package com.satya.stepDef;

import com.satya.BaseTest;
import com.satya.page.checkOutPage;
import com.satya.page.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class checkOut_StepDef extends BaseTest {

    checkOutPage checkOutPage;

    @And("User is on productlist page")
    public void userIsOnProductlistPage() {
        checkOutPage = new checkOutPage(driver);
        checkOutPage.goToProductLisPage();
    }


    @And("User add cart product Backpack")
    public void userAddCartProductBackpack() {
        checkOutPage.clickAddCartBackPack();
    }

    @And("User click cart button")
    public void userClickCartButton() {
        checkOutPage.clickButtonCart();
    }

    @And("User is on cart page")
    public void userIsOnCartPage() {
        checkOutPage = new checkOutPage(driver);
        checkOutPage.validateOverviewPage();
    }

    @And("User click checkout button")
    public void userClickCheckoutButton() {
        checkOutPage.clickButtonCheckout();
    }

    @Then("User is on Your Information")
    public void userIsOnYourInformation() {
        checkOutPage = new checkOutPage(driver);
        checkOutPage.validateYourInfoPage();
    }

    @And("User click cancel button")
    public void userClickCancelButton() {
        checkOutPage.clickButtonCancelCheckout();
    }

    @And("User click continue checkout button")
    public void userClickContinueCheckoutButton() {
        checkOutPage.clickButtonContinueCheckout();
    }

    @Then("User see error message {string}")
    public void userSeeErrorMessage(String errorMessageYourInfo) {
        checkOutPage.validateErrorMessageYourInfo(errorMessageYourInfo);
    }

    @And("User input last name with {string}")
    public void userInputLastNameWith(String lastname) {
        checkOutPage.inputLastName(lastname);
    }

    @And("User input portal code with {string}")
    public void userInputPortalCodeWith(String portalcode) {
        checkOutPage.inputPortalCode(portalcode);
    }

    @And("User input first name with {string}")
    public void userInputFirstNameWith(String firstname) {
        checkOutPage.inputFirstName(firstname);
    }

    @Then("User see error message portal code {string}")
    public void userSeeErrorMessagePortalCode(String errorMessageYourInfo) {
        checkOutPage.validateErrorMessageYourInfoFalse(errorMessageYourInfo);
    }

    @Then("User is on overview page")
    public void userIsOnOverviewPage() {
        checkOutPage= new checkOutPage(driver);
        checkOutPage.validatecheckoutOverviewPage();
    }
}
