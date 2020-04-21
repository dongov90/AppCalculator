package demoCalculator.tasks;

import demoCalculator.ui.CalculatorScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class multiplierNumber implements Task {
    @Override
    //    23*16
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(CalculatorScreen.NUMBER_2),
                Click.on(CalculatorScreen.NUMBER_3),
                Click.on(CalculatorScreen.MULTIPLIER_OPERATOR),
                Click.on(CalculatorScreen.NUMBER_1),
                Click.on(CalculatorScreen.NUMBER_6)
        );
    }
    public static multiplierNumber calculator(){
        return instrumented((multiplierNumber.class));
    }
}
