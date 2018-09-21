package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MyStepdef {

    MainPage mainPage = page(MainPage.class);

    @Given("^open (.*)$")
    public void openHttpsRiskmarketExtSidenisCom(String url){
        open(url);
    }

    @When("^user inputs \"([^\"]*)\" in element$")
    public void userInputsInElement(String arg0) throws Throwable {
        mainPage.insertCountry(arg0);
    }

    @Then("^green baloon with text appears in country widget$")
    public void checkBallonWithText(){
        mainPage.checkBaloonAppears();
    }

    @When("^a user clicks on the field \"([^\"]*)\" in the element$")
    public void aUserClicksOnTheFieldInTheElement(String arg0) throws Throwable {
//        mainPage.//;
    }

    @Then("^Enter the date \"([^\"]*)\"$")
    public void enterTheDate(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^Set flag to checkbox$")
    public void setFlagToCheckbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @When("^Click on the \"([^\"]*)\" field$")
    public void clickOnTheField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @When("^the user clicks on the field \"([^\"]*)\" in the element$")
    public void theUserClicksOnTheFieldInTheElement(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^Click on the number in the calendar$")
    public void clickOnTheNumberInTheCalendar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @When("^Click the button \"([^\"]*)\"$")
    public void clickTheButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}
