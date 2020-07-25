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

}
