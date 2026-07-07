import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.Calculator;

import sqa.lab.ShiftCipher;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

	/* private final Calculator calculator = new Calculator();

	//TC01: firstNumber = 1, secondNumber = 1, expected result = 2
	@Test
	void addition() {
		assertEquals(2, calculator.add(1, 1));
	}

	//TC02: firstNumber = 1, secondNumber = 1, expected result = 3 => failed
	@Test
	void fail_example_addition () {
		assertEquals(3, calculator.add(1, 1));
	} 

	*/

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
    void testTC03_PositiveCase() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("VTD", cipher.shift("Sqa", 3));
    }

    @Test
    void testTC04_NegativeCaseWithNumber() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("VTD1", cipher.shift("Sqa1", 3));
    }

}