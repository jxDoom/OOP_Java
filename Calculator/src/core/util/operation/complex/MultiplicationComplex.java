package core.util.operation.complex;

import core.util.Calculable;
import core.util.ComplexNumber;

public class MultiplicationComplex implements Calculable<ComplexNumber> {
    @Override
    public ComplexNumber calculation(ComplexNumber arg1, ComplexNumber arg2) {
        Double resultRe = arg1.getRe() * arg2.getRe() - arg1.getIm() * arg2.getIm();
        Double resultIm = arg1.getRe() * arg2.getIm() + arg1.getIm() * arg2.getRe();
        return new ComplexNumber(resultRe, resultIm);
    }
}
