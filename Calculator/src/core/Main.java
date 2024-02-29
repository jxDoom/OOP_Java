package core;

import core.model.ComplexNumber;
import core.model.operation.BaseCalculator;
import core.model.operation.ComplexCalculator;
import core.view.ConsoleLogger;

public class Main {
    public static void main(String[] args) {
//        BaseCalculator calculator = new BaseCalculator(new ConsoleLogger());
//        calculator.calculator('/', 3D, 4D);

        ComplexCalculator calculator = new ComplexCalculator(new ConsoleLogger());
        ComplexNumber arg1 = new ComplexNumber(4D, -1D);
        ComplexNumber arg2 = new ComplexNumber(-1D, 2D);
        calculator.complexcalc('/', arg1, arg2);

//        System.out.println(arg2.linkedComplexNumber());
    }
}
