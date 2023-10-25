package com.example.formval.entity;

import com.example.formval.validation.Code;
import jakarta.validation.constraints.*;

public class User {
    private String firstName;

    @NotNull(message = "required")
    @Size(min = 1, max = 3, message = "Must be more than 1 and less than 3")
    private String lastName;

    @Min(value = 0, message = "over 1")
    @Max(value = 10, message = "less than 10")
    private int level;

    @NotNull
    private String levelMen;

    @Pattern(regexp = "$[a-zA-Z0-9]{5}", message = "format")
    private String postal;

    @Code(value = "CDO")
    private String code;

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

    public String getLevelMen() {
        return levelMen;
    }

    public void setLevelMen(String levelMen) {
        this.levelMen = levelMen;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
