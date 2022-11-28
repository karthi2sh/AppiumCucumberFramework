package com.qa.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @When("^I enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String username) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I login$")
    public void iLogin() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^login should fail with an error \"([^\"]*)\"$")
    public void loginShouldFailWithAnError(String err) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I should see products page with title \"([^\"]*)\"$")
    public void iShouldSeeProductsPageWithTitle(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
}
