package com.bt.empmgmt.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptPasswordEncode {

    public static void main(String[] args) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String encodedPassword1 = passwordEncoder.encode("user");
        String encodedPassword2 = passwordEncoder.encode("admin");

        System.out.println("Encoded password 1 "+ encodedPassword1);
        System.out.println("Encoded password 2 "+ encodedPassword2);

        //System.out.println(passwordEncoder.matches("welcome", encodedPassword1));
    }
}