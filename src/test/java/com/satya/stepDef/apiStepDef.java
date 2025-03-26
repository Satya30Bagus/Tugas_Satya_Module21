package com.satya.stepDef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.apiPage;


public class apiStepDef {
    apiPage ApiPage;
    public apiStepDef() {
        this.ApiPage = new apiPage();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        ApiPage.prepareUrlFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        ApiPage.hitApiGetListUsers();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        ApiPage.validationStatusCodeIsEquals(status_code);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        ApiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        ApiPage.validationResponseJsonWithJSONSchema(filename);
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        ApiPage.hitApiPostCreateUser();
    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        ApiPage.validationResponseBodyCreateUser();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        ApiPage.hitApiDeleteUser();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        ApiPage.hitApiUpdateUser();
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        ApiPage.validationResponseBodyUpdateUser();
    }

    @Given("prepare an invalid URL for the {string}")
    public void prepareAnInvalidURLForThe(String url) {
        ApiPage.prepareUrlFor(url);
    }

    @Then("validation response message should be {string}")
    public void validationResponseMessageShouldBe(String arg0) {
        ApiPage.theResponseMessageShouldBe(arg0);
    }


}
