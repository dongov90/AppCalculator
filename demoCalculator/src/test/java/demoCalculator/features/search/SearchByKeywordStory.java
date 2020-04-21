package demoCalculator.features.search;

import demoCalculator.questions.CalculatorResults;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import demoCalculator.tasks.AddNumber;
import demoCalculator.tasks.divisorNumber;
import demoCalculator.tasks.minusNumber;
import demoCalculator.tasks.multiplierNumber;


import java.util.function.Predicate;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;



    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }
    @Test
    public void try_div_74_and_8() {
        anna.attemptsTo(
                divisorNumber.calculator()
        );
        anna.should(
                seeThat(CalculatorResults.DivResult(), Predicate.isEqual("9.25"))
        );
    }
    @Test
    public void try_add_5_and_9() {
        anna.attemptsTo(
                AddNumber.calculator()
        );
        anna.should(
                seeThat(CalculatorResults.AddResult(),Predicate.isEqual("14"))
        );
    }
    @Test
    public void try_mul_23_and_16() {
        anna.attemptsTo(
                multiplierNumber.calculator()
        );
        anna.should(
                seeThat(CalculatorResults.MulResult(),Predicate.isEqual("368"))
        );
    }
    @Test
    public void try_mis_89_and_13() {
        anna.attemptsTo(
                minusNumber.calculator()
        );
        anna.should(
                seeThat(CalculatorResults.MinResult(),Predicate.isEqual("76"))
        );
    }
    @After
    public void AfterTest(){
        this.herBrowser.quit();
    }


}