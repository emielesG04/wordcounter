package co.lumu.wordcounter.tasks;


import co.lumu.wordcounter.interation.WaitInteration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.lumu.wordcounter.userinterfaces.Home.TEXT_FIEL;

public class EnterText implements Task {

   private String dataText;
    public EnterText(String dataText) {

        this.dataText = dataText;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TEXT_FIEL),
                Enter.theValue(dataText).into(TEXT_FIEL)
        );
        WaitInteration.waitFor(30);
    }
    public static EnterText information(String dataText) {
        return new EnterText(dataText);
    }
}
