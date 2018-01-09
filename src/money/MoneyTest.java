package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Doller five =new Doller(5);
		assertEquals(new Doller(10), five.times(2));
		assertEquals(new Doller(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(new Doller(5).equals(new Doller(5)));
		assertFalse(new Doller(5).equals(new Doller(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(new Doller(5)));
	}

	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}

}
