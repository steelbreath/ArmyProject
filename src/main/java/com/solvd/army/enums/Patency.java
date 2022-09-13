package com.solvd.army.enums;

public enum Patency {
    HIGH("high"),
    MEDIUM("medium"),
    LOW("low");

    private final String value;

    Patency(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
