package demoCalculator.tasks;

import demoCalculator.ui.CalculatorScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class divisorNumber implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //    74 / 8
        actor.attemptsTo(
                Click.on(CalculatorScreen.NUMBER_7),
                Click.on(CalculatorScreen.NUMBER_4),
                Click.on(CalculatorScreen.DIVISOR_OPERATOR),
                Click.on(CalculatorScreen.NUMBER_8)
        );

    }
    public  static  divisorNumber calculator(){
        return instrumented((divisorNumber.class));
    }
}
