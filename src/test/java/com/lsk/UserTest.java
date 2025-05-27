package com.lsk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest  {
    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {

        //Given
        User user = new User();

        //When
        user.initPassword();

        //Then
        assertThat(user.getPassword()).isNotNull();
    }
}