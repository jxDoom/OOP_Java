package core.util.operation.base;

import core.util.Calculable;

public class Exponentiation implements Calculable<Double> {
    @Override
    public Double calculation(Double arg1, Double arg2) {
        try {
            return Math.pow(arg1, arg2);
        }catch (ArithmeticException ex) {
            throw new ArithmeticException("Под корнем отрицательное значение!");
        }
    }
}
