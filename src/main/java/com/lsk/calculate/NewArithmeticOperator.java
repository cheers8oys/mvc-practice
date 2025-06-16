package com.lsk.calculate;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculator(final PositiveNumber operand1, final PositiveNumber operand2);

}
