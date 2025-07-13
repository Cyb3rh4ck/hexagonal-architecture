/**
 * Represents a User entity in the system.
 * This class contains the user's unique identifier, name, email, and creation timestamp.
 * 
 * <p>Fields:</p>
 * <ul>
 *   <li>{@code id} - The unique identifier for the user.</li>
 *   <li>{@code name} - The name of the user.</li>
 *   <li>{@code email} - The email address of the user.</li>
 *   <li>{@code createAt} - The timestamp indicating when the user was created.</li>
 * </ul>
 * 
 * <p>Constructor:</p>
 * <ul>
 *   <li>{@link #User(UserId, UserName, UserEmail, UserCreateAt)} - Initializes a new User instance with the specified attributes.</li>
 * </ul>
 */
package com.codigojava.insurance.insurance360.user.domain;


public class User {

    private UserId id;
    private UserName name;
    private UserEmail email;
    private UserCreateAt createAt;

    public User(UserId id, UserName name, UserEmail email, UserCreateAt createAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createAt = createAt;
    }
    

}
