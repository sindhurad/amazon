package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class amazonstep {



    @Given ( "^I navigate to the toys page$" )
    public void iNavigateToTheToysPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And ( "^I select the Brookite Chinese Dragon$" )
    public void iSelectTheBrookiteChineseDragon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
    @And ( "^I click on the add to basket button$" )
    public void iClickOnTheAddToBasketButton() throws Throwable {
        System.out.println();

    }
    @Then ( "^I should see my toy in the cart page page$" )
    public void iShouldSeeMyToyInTheCartPagePage() throws Throwable {
        System.out.println("@Then ( \"^I should see my toy in the cart page page$\" )");


    }
}
