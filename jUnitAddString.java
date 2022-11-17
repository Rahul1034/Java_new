package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class jUnitAddString {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.addString("rahul", "agarwal");
		assertEquals("rahulagarwal", result);
	}

}
