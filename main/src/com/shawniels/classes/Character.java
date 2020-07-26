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
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    // Other methods
    public boolean attack(int toHitRoll, Character opponent) {
        int damage;
        //Miss
        if (toHitRoll < opponent.getArmorClass()) { return false; }

        // Hit

        else if (toHitRoll == 20)
        { damage = 2; }
        else { damage = 1; }

        int opponentCurrentHP = opponent.getHitPoints();
        opponent.setHitPoints((opponentCurrentHP - damage));
        return true;
    }

    public boolean isAlive() {
        if (hitPoints < 0) { return false; }
        else return true;
    }
}