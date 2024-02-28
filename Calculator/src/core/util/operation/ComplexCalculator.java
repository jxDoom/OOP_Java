package core.util.operation;

import core.util.Calculable;
import core.util.ComplexNumber;
import core.util.operation.complex.AdditionComplex;
import core.util.operation.complex.DivisionComplex;
import core.util.operation.complex.MultiplicationComplex;
import core.util.operation.complex.SubstractionComplex;

import java.util.HashMap;

public class ComplexCalculator {
    private ComplexNumber result;

    public ComplexNumber complexcalc(char operator, ComplexNumber arg1, ComplexNumber arg2) {
        HashMap<Character, Calculable<ComplexNumber>> complexMap = new HashMap<>();
        complexMap.put('+', new AdditionComplex());
        complexMap.put('-', new SubstractionComplex());
        complexMap.put('*', new MultiplicationComplex());
        complexMap.put('/', new DivisionComplex());

        result = complexMap.get(operator).calculation(arg1, arg2);
        System.out.printf("(%s) %s (%s) = %s\n", arg1, operator, arg2, result);
        return result;
    }
}
