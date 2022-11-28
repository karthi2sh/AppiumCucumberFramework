package com.qa.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDef {

    @Given("^I'm logged in$")
    public void iMLoggedIn() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^The product is listed with title \"([^\"]*)\" and price \"([^\"]*)\"$")
    public void theProductIsListedWithTitleAndPrice(String title, String price) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I click product title \"([^\"]*)\"$")
    public void iClickProductTitle(String title) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I should be on product details page with title \"([^\"]*)\", price \"([^\"]*)\" and description \"([^\"]*)\"$")
    public void iShouldBeOnProductDetailsPageWithTitleSauceLabsBackpackPriceAndDescription(String title, String price, String description) {
        // Write code here that turns the phrase above into concrete actions
    }
}
