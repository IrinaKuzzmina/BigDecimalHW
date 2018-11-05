package packageforclasesses.Homework11.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator  implements ArithmeticOperations  {
    @Override
    public BigDecimal divide(BigDecimal x, BigDecimal y) throws DivisionByZero {
        if (y.compareTo(BigDecimal.ZERO)==0)
            throw new DivisionByZero();
        return x.divide(y,2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal multiply(BigDecimal x, BigDecimal y) {
        return x.multiply(y);
    }
}