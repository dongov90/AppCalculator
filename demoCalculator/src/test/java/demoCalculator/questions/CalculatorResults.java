package demoCalculator.questions;

import demoCalculator.ui.CalculatorScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Test;

public class  CalculatorResults implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CalculatorScreen.RESULT).viewedBy(actor).asString();
    }

    public static Question<String> AddResult(){
        return new CalculatorResults();

    }
    public static Question<String> DivResult(){
        return new CalculatorResults();

    }
    public static Question<String> MinResult(){
        return new CalculatorResults();

    }
    public static Question<String> MulResult(){
        return new CalculatorResults();

    }
}
