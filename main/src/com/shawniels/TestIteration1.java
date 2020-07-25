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

}
