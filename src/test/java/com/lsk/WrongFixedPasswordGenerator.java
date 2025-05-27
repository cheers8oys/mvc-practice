package com.lsk;

public class WrongFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "12"; //4글자
    }
}
