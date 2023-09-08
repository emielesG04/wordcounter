package co.lumu.wordcounter.questions;

import co.lumu.wordcounter.userinterfaces.Home;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MessageWhenFieldIsEmpty implements Question<String> {

    @Step("{0} check the confirmation message")

    @Override
    public String answeredBy(Actor actor) {
        return Home.TEXT_FIEL.resolveFor(actor).getText().trim();
    }
    public static MessageWhenFieldIsEmpty messageIs(){

        return new MessageWhenFieldIsEmpty();
    }
}
