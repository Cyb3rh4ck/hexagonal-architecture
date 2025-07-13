package com.codigojava.insurance.insurance360.user.domain;

public class UserEmail {

    private String value;

    public UserEmail(String value) {
        this.value = value;
        ensureIsValid();
    }

    private void ensureIsValid() {
        if (this.value == null || this.value.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if (!this.value.contains("@") || !this.value.contains(".")) {
            throw new IllegalArgumentException("Email must contain '@' and '.'");
        }
    }

    public String getValue() {
        return value;
    }
}
