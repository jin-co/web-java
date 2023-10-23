package com.example.formval.entity;

import jakarta.validation.constraints.*;

public class User {
    private String firstName;

    @NotNull(message = "required")
    @Size(min = 1, message = "Must be over 1")
    private String lastName;

    @Min(value = 0, message = "over 1")
    @Max(value = 10, message = "less than 10")
    private int level;

    @NotNull
    private String levelMen;

    @Pattern(regexp = "$[a-zA-Z0-9]{5}", message = "format")
    private String postal;

    public User() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
