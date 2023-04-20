package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import welcome.Welcome;

class WelcomeTest {

	@Test
	void testExo1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
		assertEquals(Welcome.welcome("marie"),"Hello, Marie");
		assertEquals(Welcome.welcome("julien"),"Hello, Julien");
	}
}
