package com.javalogic.misc;
//public class AuthenticationSystem { }
public class AuthenticationSystem {
    public static String authenticate(Object credentials) {
        return switch (credentials) {
            case String[] loginDetails when loginDetails.length == 2 ->
                    "Username/Password authentication for user: " + loginDetails[0];
            case Integer otp when otp >= 1000 && otp <= 9999 ->
                    "OTP authentication successful.";
            case byte[] fingerprint when fingerprint.length == 256 ->
                    "Fingerprint authentication successful.";
            default -> "Authentication failed.";
        };
    }

    public static void main(String[] args) {
        System.out.println(authenticate(new String[]{"admin", "password123"}));
        System.out.println(authenticate(1234));
        System.out.println(authenticate(new byte[256]));
        System.out.println(authenticate("XYZ"));
    }
}
