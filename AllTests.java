package jUnitSuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import jUnitTestPackage.jUnitAddString;
import jUnitTestPackage.testAddNumbers;

@RunWith(Suite.class)
@SuiteClasses({testAddNumbers.class, jUnitAddString.class})
public class AllTests {

}
