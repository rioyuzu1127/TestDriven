package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Doller five =new Doller(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}