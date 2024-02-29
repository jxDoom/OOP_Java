package core.model.operation.complex;

import core.model.operation.impl.Calculable;
import core.model.ComplexNumber;
import core.model.operation.ComplexCalculator;
import core.view.ConsoleLogger;

public class DivisionComplex implements Calculable<ComplexNumber> {
    @Override
    public ComplexNumber calculation(ComplexNumber arg1, ComplexNumber arg2) {
        ComplexCalculator calculator = new ComplexCalculator(new ConsoleLogger());
        ComplexNumber numerator = calculator.complexcalc('*', arg1, arg2.linkedComplexNumber());
        ComplexNumber denominator = calculator.complexcalc('*', arg2, arg2.linkedComplexNumber());
        return new ComplexNumber(numerator.getRe() / denominator.getRe(), numerator.getIm() / denominator.getRe());
    }
}
