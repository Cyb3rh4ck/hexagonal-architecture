package com.codigojava.insurance.insurance360.user.domain;

import java.util.Date;

public class UserCreateAt {

    private Date value;

    public UserCreateAt(Date value) {
        this.value = value;
        ensureIsValid();
    }

    private void ensureIsValid() {
        if (this.value == null) {
            throw new IllegalArgumentException("CreateAt cannot be null");
        }
        // Additional validation can be added here if needed
    }

    public Date getValue() {
        return value;
    }

}
