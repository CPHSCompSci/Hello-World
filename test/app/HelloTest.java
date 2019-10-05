package app;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class HelloTest {

	@Test
	void test1() {
		assertEquals(4,Hello.add(1,3));
	}
	
	@Test
	void test2() {
		assertEquals(4,Hello.add(2,2));
	}
	

}
