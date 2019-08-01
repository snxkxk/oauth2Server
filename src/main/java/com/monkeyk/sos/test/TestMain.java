package com.monkeyk.sos.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestMain {

    public static void main(String[] args) {
        BCryptPasswordEncoder pd=new BCryptPasswordEncoder();
        System.out.println(pd.encode("implicit-secret"));
    }
}
