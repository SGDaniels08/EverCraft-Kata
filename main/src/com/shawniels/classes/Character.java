package com.shawniels.classes;

public class Character {

    // Instance Variables
    private String name;
    public enum Alignment {
        GOOD, NEUTRAL, EVIL
    }
    private Alignment alignment;
    private int armorClass;
    private int hitPoints;

    // Constructor
    public Character() {
        this.armorClass = 10;
        this.hitPoints = 5;
    }
    public Character(String name, Alignment alignment, int armorClass, int hitPoints) {
        this.name = name;
        this.alignment = alignment;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
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
    public int getArmorClass() {
        return armorClass;
    }
    public void setArmorClass() {
        this.armorClass = armorClass;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints() {
        this.hitPoints = hitPoints;
    }
}
