package core.util.operation.base;

import core.util.Calculable;

public class Division implements Calculable<Double> {
    @Override
    public Double calculation(Double arg1, Double arg2) {
        try {
            return arg1 / arg2;
        }catch (ArithmeticException ex) {
            throw new ArithmeticException("На нуль делить нельзя!");
        }
    }
}
