@checkout
Feature: Checkout

  @go-to-checkout-page
  Scenario: Verify that the user succesfully go to checkout page
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User add cart product Backpack
    And User click cart button
    And User is on cart page
    And User click checkout button
    Then User is on Your Information

  @checkout-empty-information
  Scenario: Verify that the user has doing checkout without input any Information
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User add cart product Backpack
    And User click cart button
    And User is on cart page
    And User click checkout button
    Then User is on Your Information
    And User click continue checkout button
    Then User see error message "Error: First Name is required"

  @checkout-empty-firstname
  Scenario: Verify that the user has doing checkout without input First Name
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User add cart product Backpack
    And User click cart button
    And User is on cart page
    And User click checkout button
    Then User is on Your Information
    And User input last name with "bagus"
    And User input portal code with "0812"
    And User click continue checkout button
    Then User see error message "Error: First Name is required"

  @checkout-empty-lastname
  Scenario: Verify that the user has doing checkout without input Last Name
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User add cart product Backpack
    And User click cart button
    And User is on cart page
    And User click checkout button
    Then User is on Your Information
    And User input first name with "satya"
    And User input portal code with "0812"
    And User click continue checkout button
    Then User see error message "Error: Last Name is required"

  @checkout-empty-zipcode
  Scenario: Verify that the user has doing checkout without input Portal Code
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User add cart product Backpack
    And User click cart button
    And User is on cart page
    And User click checkout button
    Then User is on Your Information
    And User input first name with "satya"
    And User input last name with "bagus"
    And User click continue checkout button
    Then User see error message portal code "Error: Portal Code is required"

  @checkout-overview-page
  Scenario: Verify that the user succesfully can cancel Checkout process
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User add cart product Backpack
    And User click cart button
    And User is on cart page
    And User click checkout button
    Then User is on Your Information
    And User input first name with "satya"
    And User input last name with "bagus"
    And User input portal code with "0812"
    And User click continue checkout button
    Then User is on overview page
