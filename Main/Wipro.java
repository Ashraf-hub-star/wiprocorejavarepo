package com.ashraf.junit5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
class StringTest {

	@Test
	void test() {
		int actualLength = "ABCDE".length();
		
		int expectedLength =5;
		
		assertEquals(expectedLength, actualLength);
	}

}
