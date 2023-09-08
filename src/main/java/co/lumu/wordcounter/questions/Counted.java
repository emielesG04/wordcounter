package co.lumu.wordcounter.questions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.lumu.wordcounter.userinterfaces.Home.COUNTED;

public class Counted implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return COUNTED.resolveFor(actor).getText();
    }
    public static Counted error() {
        return new Counted();
    }
}

