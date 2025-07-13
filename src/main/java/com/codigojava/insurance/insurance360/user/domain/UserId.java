package com.codigojava.insurance.insurance360.user.domain;

public class UserId {

    private String value;

    public UserId(String value) {
        this.value = value;
        ensureIsValid();
    }

    private void ensureIsValid() {
        if (this.value.length() < 5) {
            throw new IllegalArgumentException("UserId must be at least 5 characters long");
        }
    }

     public String getValue() {
        return value;
    }

}
