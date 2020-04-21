package demoCalculator.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculatorScreen {
//    5+9
    public static final Target NUMBER_5 = Target.the("#5 number").located(By.id("com.google.android.calculator:id/digit_5"));
    public static final Target NUMBER_9 = Target.the("#9 number").located(By.id("com.google.android.calculator:id/digit_9"));
    public static final Target ADD_OPERATOR = Target.the("add operator").located(By.id("com.google.android.calculator:id/op_add"));
//    23*16
    public static final Target NUMBER_2 = Target.the("#2 number").located(By.id("com.google.android.calculator:id/digit_2"));
    public static final Target NUMBER_3 = Target.the("#3 number").located(By.id("com.google.android.calculator:id/digit_3"));
    public static final Target NUMBER_1 = Target.the("#1 number").located(By.id("com.google.android.calculator:id/digit_1"));
    public static final Target NUMBER_6 = Target.the("#6 number").located(By.id("com.google.android.calculator:id/digit_6"));
    public static final Target MULTIPLIER_OPERATOR = Target.the("multiplier operator").located(By.id("com.google.android.calculator:id/op_mul"));

//    74 / 8

    public static final Target NUMBER_7 = Target.the("#7 number").located(By.id("com.google.android.calculator:id/digit_7"));
    public static final Target NUMBER_8 = Target.the("#8 number").located(By.id("com.google.android.calculator:id/digit_8"));
    public static final Target NUMBER_4 = Target.the("#4 number").located(By.id("com.google.android.calculator:id/digit_4"));
    public static final Target DIVISOR_OPERATOR = Target.the("divisor operator").located(By.id("com.google.android.calculator:id/op_div"));
//   89 -13
    public static final Target MINUS_OPERATOR = Target.the("minus operator").located(By.id("com.google.android.calculator:id/op_sub"));
// Reusult
public static final Target RESULT = Target.the("result operator").located(By.id("com.google.android.calculator:id/result_preview"));
}

