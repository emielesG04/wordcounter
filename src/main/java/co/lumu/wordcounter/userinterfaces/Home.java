package co.lumu.wordcounter.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target TEXT_FIEL =
            Target.the("text fiel")
            .locatedBy("//*[@class='form-control table-data finalResult textarea_revision processed']");

}
