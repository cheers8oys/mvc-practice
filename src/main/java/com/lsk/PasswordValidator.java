package com.lsk;


// 테스트코드가 있으므로 마음 놓고 리팩토링 해볼 수 있음
public class PasswordValidator {

    private static final String WRONG_PASSWORD_EXCEPTION_MESSAGE = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    public static void validate(String password) {
        int length = password.length();
        
        if(length < 8 || length > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_EXCEPTION_MESSAGE);
        }
    }
}
