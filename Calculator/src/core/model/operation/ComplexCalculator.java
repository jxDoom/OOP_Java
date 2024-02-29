package core.model.operation;

import core.model.operation.impl.Calculable;
import core.model.ComplexNumber;
import core.model.operation.complex.AdditionComplex;
import core.model.operation.complex.DivisionComplex;
import core.model.operation.complex.MultiplicationComplex;
import core.model.operation.complex.SubstractionComplex;
import core.view.impl.Loggable;

import java.util.HashMap;

public class ComplexCalculator {
    private ComplexNumber result;
    private final Loggable logger;

    public ComplexCalculator(Loggable logger) {
        this.logger = logger;
    }

    public ComplexNumber complexcalc(char operator, ComplexNumber arg1, ComplexNumber arg2) {
        HashMap<Character, Calculable<ComplexNumber>> complexMap = new HashMap<>();
        complexMap.put('+', new AdditionComplex());
        complexMap.put('-', new SubstractionComplex());
        complexMap.put('*', new MultiplicationComplex());
        complexMap.put('/', new DivisionComplex());

        result = complexMap.get(operator).calculation(arg1, arg2);
        System.out.printf("First Number: %s, Operation: '%s', Second Number: %s\n", arg1, operator, arg2);
        System.out.printf("Result = %s\n\n", result);
        logger.log(String.format("(%s) %s (%s) = %s", arg1, operator, arg2, result));
        return result;
    }
}
