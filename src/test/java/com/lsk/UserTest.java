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
        user.initPassword(new RandomPasswordGenerator());

        //Then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드를 조건에 부합하면 초기화한다.")
    @Test
    void passwordTest2() {

        //Given
        User user = new User();

        //When
        user.initPassword(() -> "12345678");

        //Then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드를 조건에 부합하지 않아 초기화하지 않는다.")
    @Test
    void passwordTest3() {

        //Given
        User user = new User();

        //When
        user.initPassword(() -> "ab");

        //Then
        assertThat(user.getPassword()).isNull();
    }
}