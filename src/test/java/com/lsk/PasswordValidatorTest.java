package com.lsk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {

    @DisplayName("비밀번호가 8자 이상, 12자 이하이면 예외가 발생하지 않는다. ")
    @Test
    void validatePasswordTest () {
         assertThatCode(() -> PasswordValidator.validate("password1234"))
                 .doesNotThrowAnyException();
    }
}
