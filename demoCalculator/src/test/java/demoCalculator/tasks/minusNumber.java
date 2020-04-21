package demoCalculator.tasks;

import demoCalculator.ui.CalculatorScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class minusNumber implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //   89 -13
        actor.attemptsTo(
                Click.on(CalculatorScreen.NUMBER_8),
                Click.on(CalculatorScreen.NUMBER_9),
                Click.on(CalculatorScreen.MINUS_OPERATOR),
                Click.on(CalculatorScreen.NUMBER_1),
                Click.on(CalculatorScreen.NUMBER_3)
        );

    }
    public  static  minusNumber calculator(){
        return instrumented((minusNumber.class));
    }
}
