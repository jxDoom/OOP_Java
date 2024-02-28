package core.util.operation.base;

import core.util.Calculable;

public class Multiplication implements Calculable<Double> {
    @Override
    public Double calculation(Double arg1, Double arg2) {
        return arg1 * arg2;
    }
}
