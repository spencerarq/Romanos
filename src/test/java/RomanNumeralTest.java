package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @Test
    public void testConvertSingleRoman() {
        RomanNumeral converter = new RomanNumeral();
        assertEquals(1, converter.convert("I"));
        assertEquals(5, converter.convert("V"));
    }

    @Test
    public void testConvertComplexRoman() {
        RomanNumeral converter = new RomanNumeral();
        assertEquals(9, converter.convert("IX"));
        assertEquals(42, converter.convert("XLII"));
        assertEquals(1994, converter.convert("MCMXCIV"));
    }
}