package core.util.operation.complex;

import core.util.Calculable;
import core.util.ComplexNumber;
import core.util.operation.ComplexCalculator;

public class DivisionComplex implements Calculable<ComplexNumber> {
    @Override
    public ComplexNumber calculation(ComplexNumber arg1, ComplexNumber arg2) {
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexNumber numerator = calculator.complexcalc('*', arg1, arg2.linkedComplexNumber());
        ComplexNumber denominator = calculator.complexcalc('*', arg2, arg2.linkedComplexNumber());
        return new ComplexNumber(numerator.getRe() / denominator.getRe(), numerator.getIm() / denominator.getRe());
    }
}
