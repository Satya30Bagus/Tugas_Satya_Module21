package com.satya.stepDef;

import com.satya.BaseTest;
import com.satya.page.checkOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkOut_StepDef extends BaseTest {

    checkOutPage checkoutpage;

    public checkOut_StepDef() {
        this.checkoutpage = new checkOutPage(driver);
    }

    @And("User click checkout button")
    public void Userclickcheckoutbutton() {
        checkoutpage.clickButtonCheckout();
    }

    @Then("User is on Your Information")
    public void UserisonYourInformation() {

        checkoutpage = new checkOutPage(driver);
        checkoutpage.validateYourInfoPage();
    }

    @And("User click cancel button")
    public void userClickCancelButton() {

        checkoutpage.clickButtonCancelCheckout();
    }

    @Then("User see error message portal code {string}")
    public void userSeeErrorMessagePortalCode(String errorMessageYourInfo) {

        checkoutpage.validateErrorMessageYourInfoFalse(errorMessageYourInfo);
    }

    @And("User input last name with {string}")
    public void userInputLastNameWith(String lastname) {

        checkoutpage.inputLastName(lastname);
    }

    @And("User input portal code with {string}")
    public void userInputPortalCodeWith(String portalcode) {

        checkoutpage.inputPortalCode(portalcode);
    }

    @And("User input first name with {string}")
    public void userInputFirstNameWith(String firstname) {

        checkoutpage.inputFirstName(firstname);
    }

    @Then("User is on overview page")
    public void userIsOnOverviewPage() {

        checkoutpage = new checkOutPage(driver);
        checkoutpage.validateOverviewPage();
    }

    @And("click cancel button")
    public void clickCancelButton() {

        checkoutpage.clickButtonCancelCheckout();
    }

    @And("User click finish button")
    public void userClickFinishButton() {

        checkoutpage.clickButtonFinishCheckout();
    }

    @Then("User is on checkout complete page")
    public void userIsOnCheckoutCompletePage() {

        checkoutpage = new checkOutPage(driver);
        checkoutpage.validateOrderComplete();
    }

    @And("User click back home button")
    public void userClickBackHomeButton() {

        checkoutpage.clickButtonBackHome();
    }

    @And("User click continue checkout button")
    public void userClickContinueCheckoutButton() {

        checkoutpage.clickButtonContinueCheckout();
    }

    @Then("User see error message {string}")
    public void userSeeErrorMessage(String errorMessageYourInfo) {

        checkoutpage.validateErrorMessageYourInfo(errorMessageYourInfo);
    }

    @Given("User doing login with {string} and {string}")
    public void userDoingLoginWithAnd(String arg0, String arg1) {
    }

    @When("User is on productlist page")
    public void userIsOnProductlistPage() {
        checkoutpage = new checkOutPage(driver);
        checkoutpage.validateOnCartPage();
    }

    @And("User add cart product Backpack")
    public void userAddCartProductBackpack() {
    }

    @And("User click cart button")
    public void userClickCartButton() {
//        checkoutpage.clickButtonCart();
    }

    @And("User is on cart page")
    public void userIsOnCartPage() {
    }
}