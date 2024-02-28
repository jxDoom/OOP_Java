package core;

import core.util.ComplexNumber;
import core.util.operation.BaseCalculator;
import core.util.operation.ComplexCalculator;

public class Main {
    public static void main(String[] args) {
//        BaseCalculator calculator = new BaseCalculator();
//        calculator.calculator('/', 3D, 0D);

        ComplexCalculator calculator = new ComplexCalculator();
        ComplexNumber arg1 = new ComplexNumber(4D, -1D);
        ComplexNumber arg2 = new ComplexNumber(-1D, 2D);
        calculator.complexcalc('/', arg1, arg2);
//        System.out.println(arg2.linkedComplexNumber());
    }
}
