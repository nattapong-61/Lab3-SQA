package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShiftCipherTest {

	@Test
    void testTC01_SoftwareUppercase() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("ZVMADHYL", cipher.shift("SOFTWARE", 3));
    }

    @Test
    void testTC02_SoftwareLowercase() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("zvmadhyl", cipher.shift("software", 3));
    }

    @Test
    void testTC02_PositiveCase() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("KHOOR", cipher.shift("HELLO", 3));
    }

    @Test
    void testTC04_NegativeCaseWithNumber() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("VTD1", cipher.shift("Sqa1", 3));
    }

}