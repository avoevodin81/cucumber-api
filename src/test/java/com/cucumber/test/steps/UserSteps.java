package com.cucumber.test.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps {
    @Given("the user doesn't have an account")
    public void theUserDoesnTHaveAnAccount() {
    }

    @When("the user provides name, email, password")
    public void theUserProvidesNameEmailPassword() {
    }

    @Then("the user receives {int} status code")
    public void theUserReceivesStatusCode(int arg0) {
    }

    @And("the user receives id")
    public void theUserReceivesId() {
    }
}
