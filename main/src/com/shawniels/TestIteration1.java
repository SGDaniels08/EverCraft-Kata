package com.shawniels;

import com.shawniels.classes.Character;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestIteration1 {

    @Test
    public void makeCharacterGetNameFunctional() {
        // Arrangement
        Character testCharacter = new Character();

        // Activation
        testCharacter.setName("Pakin");

        // Assertion
        assertEquals("Pakin", testCharacter.getName());
    }

    @Test
    public void setAlignmentAndGetAlignmentWork() {
        // Arrangement
        Character testCharacter = new Character();

        // Activation
        testCharacter.setAlignment(Character.Alignment.GOOD);

        // Assertion
        assertEquals(Character.Alignment.GOOD, testCharacter.getAlignment());
    }

    @Test
    public void armorClassDefaultsToTen() {
        // Arrangement and Activation
        Character testCharacter = new Character();

        // Assertion
        assertEquals(10, testCharacter.getArmorClass());
    }

    @Test
    public void hitPointsDefaultsToFive() {
        // Arrangement and Activation
        Character testCharacter = new Character();

        // Assertion
        assertEquals(5, testCharacter.getHitPoints());
    }

    @Test
    public void toHitRollBelowOpponentsArmorClassMisses() {
        // Arrangement
        Character testCharacter = new Character();
        Character testOpponent = new Character();

        // Activation and Assertion
        assertEquals(false, testCharacter.attack(5, testOpponent));
    }

    @Test
    public void toHitRollAboveOpponentsArmorClassHits() {
        // Arrangement
        Character testCharacter = new Character();
        Character testOpponent = new Character();

        // Activation and Assertion
        assertEquals(true, testCharacter.attack(15, testOpponent));
    }

    @Test
    public void hitCharacterTakesDamage() {
        // Arrangement
        Character testCharacter = new Character();
        Character testOpponent = new Character();

        // Activation
        testCharacter.attack(15, testOpponent);

        // Assertion
        assertEquals(4, testOpponent.getHitPoints());
    }

    @Test
    public void criticalHitDoublesDamage() {
        // Arrangement
        Character testCharacter = new Character();
        Character testOpponent = new Character();

        // Activation
        testCharacter.attack(20, testOpponent);

        // Assertion
        assertEquals(3, testOpponent.getHitPoints());
    }

    @Test
    public void characterHitPointsZeroCharacterDies() {}

}
