package com.lsk;

import com.lsk.calculate.*;

import java.util.List;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticsOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());


    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticsOperators.stream()
                .filter(arithmeticsOperators -> arithmeticsOperators.supports(operator))
                .map(arithmeticsOperators -> arithmeticsOperators.calculator(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
