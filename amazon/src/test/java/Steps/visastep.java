package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class visastep
{
    @Given("^I navigate to sign in page$")
    public void iNavigateToSignInPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter the password as Sucess@(\\d+)$")
    public void iEnterThePasswordAsSucess(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should see the choose an appointment page$")
    public void iShouldSeeTheChooseAnAppointmentPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


    @And("^I enter the password as \"([^\"]*)\"$")
    public void iEnterThePasswordAs(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
