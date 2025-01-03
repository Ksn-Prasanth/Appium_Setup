package com.Android.Stepdef;

import com.Android.Pages.Homescreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomescreenDef {
    @When("I click on the first button")
    public void i_click_on_the_first_button() throws InterruptedException {
            new Homescreen().test();
    }
    @When("select the functionality we want")
    public void select_the_functionality_we_want() {

    }
    @Then("verify it")
    public void verify_it() {

    }
}
