package core.util.operation;

import core.util.Calculable;
import core.util.operation.base.*;

import java.util.HashMap;

public class BaseCalculator {
    protected Double result;

    public BaseCalculator() {
    }

    public Double calculator(char operator, Double num1, Double num2) {
        HashMap<Character, Calculable<Double>> baseMap = new HashMap<>();
        baseMap.put('+', new Addition());
        baseMap.put('-', new Substraction());
        baseMap.put('*', new Multiplication());
        baseMap.put('/', new Division());
        baseMap.put('^', new Exponentiation());

        result = baseMap.get(operator).calculation(num1, num2);
        System.out.printf("%s %s %s = %s\n", num1, operator, num2, result);
        return result;
    }
}
