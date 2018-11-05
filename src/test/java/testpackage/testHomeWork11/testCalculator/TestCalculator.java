package testpackage.testHomeWork11.testCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import packageforclasesses.Homework11.calculator.Calculator;
import packageforclasesses.Homework11.calculator.DivisionByZero;

import java.math.BigDecimal;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        BigDecimal x = new BigDecimal("6.000");
        BigDecimal y = new BigDecimal("3.00");
        try {
            BigDecimal actualResult = calculator.divide(x, y);
            System.out.println(actualResult);
        } catch (DivisionByZero ex) {
            System.out.println("You can't divide by 0");
        }
        System.out.println(calculator.multiply(x,y));

    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        BigDecimal x = new BigDecimal("6.000");
        BigDecimal y = new BigDecimal("3.00");
        BigDecimal expectedResult = new BigDecimal("2.00");
        try {
            BigDecimal actulaResult = calculator.divide(x, y);
            assert (actulaResult.compareTo(expectedResult) == 0);
        } catch (DivisionByZero ex) {
            System.out.println("You can't divide by 0");
        }
    }
    @Test
    public void testMultiply() {
        Calculator calculator1 = new Calculator();
        BigDecimal x = new BigDecimal("6.000");
        BigDecimal y = new BigDecimal("3.00");
        BigDecimal expectedResult = new BigDecimal("18.00000");
        BigDecimal actualResult = calculator1.multiply(x, y);
        assert (actualResult.compareTo(expectedResult)==0);

    }

}

