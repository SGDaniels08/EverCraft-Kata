package com.shawniels.classes;

public class Character {

    // Instance Variables
    private String name;
    public enum Alignment {
        GOOD, NEUTRAL, EVIL
    }
    private Alignment alignment;

    // Constructor
    public Character() {}
    public Character(String name, Alignment alignment) {
        this.name = name;
        this.alignment = alignment;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Alignment getAlignment() {
        return alignment;
    }
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }
}
