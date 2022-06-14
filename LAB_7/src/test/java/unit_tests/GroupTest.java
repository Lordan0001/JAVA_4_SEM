package unit_tests;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest extends BaseTest {
    private Calculator calculator = new Calculator();
    private final double FIRST_NUM = 10;
    private final double SECOND_NUM = 5;

    @Test(priority = 2)
    public void checkAdd(){
        double expectResult = FIRST_NUM + SECOND_NUM;
        double actualResult = calculator.add(FIRST_NUM,SECOND_NUM);

        Assert.assertEquals(actualResult, expectResult,"The result is not corrected for adding");
    }
    //будет падать???
    @Test(groups = "mult test")
    public void checkSecondMult(){
        double expectResult = FIRST_NUM * SECOND_NUM;
        double actualResult = calculator.errorMult(FIRST_NUM, SECOND_NUM);

        Assert.assertEquals(actualResult, expectResult,"The result is not corrected for mult");
    }
    @Test(groups = "console tests",dependsOnMethods = "checkSecondMult")
    public void checkSomething(){
        System.out.println("Hello World!");
    }

    @Test(description = "Проверить что-то",groups = "console tests")
    public void check(){
        System.out.println("I am the test method");
    }

}
