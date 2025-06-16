package com.lsk;


import com.lsk.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * MVC패턴 기반으로 구현한다.
 */

public class CalculatorTest {

    @DisplayName("덧셈 연습을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int operand1, String operator, int operand2) {

        int calculateResult  = Calculator.calculate(new PositiveNumber(1), "+", new PositiveNumber(2));
        assertThat(calculateResult).isEqualTo(3);

    }

    private static  Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)
         );
    }


    /**
     * PositivieNumber로 인해 이미 IllegalArgument 예외처리가 되므로 이 테스트는 의미 없어졌고
     * 대신에 PositiveNubmerTest를 이용해서 0 또는 음수가 정상적으로 전달되지 않는지 확인해보는 테스트 해봐야 함.
     */

//    @Test
//    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.")
//    void calculateException(){
//        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
//                .isInstanceOf(IllegalArgumentException.class);
//    }

}
