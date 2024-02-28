package core.util.operation.base;

import core.util.Calculable;

public class Addition implements Calculable<Double> {
    @Override
    public Double calculation(Double arg1, Double arg2) {
        return arg1 + arg2;
    }
}
