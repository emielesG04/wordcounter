package co.lumu.wordcounter.stepdefinitions;

import co.lumu.wordcounter.exceptions.UpdateInfoError;
import co.lumu.wordcounter.interation.WaitInteration;
import co.lumu.wordcounter.models.DataText;
import co.lumu.wordcounter.questions.Counted;
import co.lumu.wordcounter.tasks.EnterText;
import co.lumu.wordcounter.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static co.lumu.wordcounter.utils.Constants.COUNTED_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class WriteTextStepDefinitions {

    @Given("I log in the page")
    public void iLogInThePage() {
        theActorInTheSpotlight().wasAbleTo(
                Open.url(Constants.URL)
        );
    }
    @Then("^I see the (.*)$")
    public void ISeeTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(Counted.error(),equalTo(message))
                .orComplainWith(UpdateInfoError.class,COUNTED_ERROR));
    }

    @When("^he enters the text (.*)$")
    public void heEntersTheTextQaAutomation(String text) {
        theActorInTheSpotlight().attemptsTo(EnterText.information(text));
    }
}
