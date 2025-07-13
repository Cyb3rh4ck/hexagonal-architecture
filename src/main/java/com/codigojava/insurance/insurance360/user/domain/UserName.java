package com.codigojava.insurance.insurance360.user.domain;

public class UserName {

    private String value;

    public UserName(String value) {
        this.value = value;
        ensureIsValid();
    }

    private void ensureIsValid() {
        if (this.value == null || this.value.trim().isEmpty()) {
            throw new IllegalArgumentException("UserName cannot be null or empty");
        }
        if (this.value.length() < 3) {
            throw new IllegalArgumentException("UserName must be at least 3 characters long");
        }
    }

    public String getValue() {
        return value;
    }

}
