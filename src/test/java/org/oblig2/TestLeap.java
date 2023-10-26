package org.oblig2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLeap {

    @Test
    public void delbartmed4ikke100() {
        assertTrue(isLeapYear(8));
    }

    @Test
    public void delbartmed400() {
        assertTrue(isLeapYear(800));
    }

    @Test
    public void ikkeDelbartMed4() {
        assertFalse(isLeapYear(5));
    }

    @Test
    public void delbartMed100Ikke400() {
        assertFalse(isLeapYear(300));
    }

    /**
     * This is a function returning either true or false based on the variable year given to it.
     */
    public static boolean isLeapYear(int year) {
        // It will return true if year is not devidable by 100 AND if year is dividable by 4
        if((year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        // It will also return true if int year is dividable by 400

        if((year % 400 == 0)) {
            return true;
        }

        // Else returns false

        return false;
    }

}
