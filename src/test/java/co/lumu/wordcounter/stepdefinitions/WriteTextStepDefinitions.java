package co.lumu.wordcounter.stepdefinitions;

import co.lumu.wordcounter.exceptions.UpdateInfoError;
import co.lumu.wordcounter.questions.MessageWhenFieldIsEmpty;
import co.lumu.wordcounter.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;

import static co.lumu.wordcounter.utils.Constants.NO_MESSAGE_DISPLAYED_ERROR;
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
    @Then("^I see the message (.*)$")
    public void elUsuarioDebeVerElNombreWelcomePruebas(String message) {
        theActorInTheSpotlight().should(
                seeThat(MessageWhenFieldIsEmpty.messageIs(), equalTo(message))
                        .orComplainWith(UpdateInfoError.class,NO_MESSAGE_DISPLAYED_ERROR));
    }
}
