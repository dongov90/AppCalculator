package demoCalculator.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import demoCalculator.ui.CalculatorScreen;

public class AddNumber implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //    5+9
        actor.attemptsTo(
                Click.on(CalculatorScreen.NUMBER_5),
                Click.on(CalculatorScreen.ADD_OPERATOR),
                Click.on(CalculatorScreen.NUMBER_9)
        );

    }
    public  static  AddNumber calculator(){
        return instrumented((AddNumber.class));
    }
}
